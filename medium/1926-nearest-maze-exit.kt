    fun nearestExit(maze: Array<CharArray>, entrance: IntArray): Int {
        if(maze.size == 0 || maze[0].size == 0) return -1
        
        fun visit(position: IntArray, options: MutableList<IntArray>) {
            val (y, x) = position 

            maze[y][x] = 'V'
            if(y - 1 >= 0 && maze[y - 1][x] == '.') {
                options.add(intArrayOf(y - 1, x))
                maze[y - 1][x] = 'V'
            }
            if(y + 1 < maze.size && maze[y + 1][x] == '.') {
                options.add(intArrayOf(y + 1, x))
                maze[y + 1][x] = 'V'
            }
            if(x - 1 >= 0 && maze[y][x - 1] == '.')  {
                options.add(intArrayOf(y, x - 1))
                maze[y][x - 1] = 'V'
            }
            if(x + 1 < maze[0].size && maze[y][x + 1] == '.') {
                options.add(intArrayOf(y, x + 1))
                maze[y][x + 1] = 'V'
            }
        }

        var options = mutableListOf<IntArray>()
        var steps = 1

        visit(entrance, options)

        while(options.size > 0) {
            val nextOptions = mutableListOf<IntArray>()

            for(option in options) {
                val (y, x) = option 

                if (y == 0 || y == maze.size - 1 || x == 0 || x == maze[0].size - 1) {
                    return steps
                }
                
                visit(option, nextOptions)
            }

            options = nextOptions
            steps += 1
        }

        return -1
    }
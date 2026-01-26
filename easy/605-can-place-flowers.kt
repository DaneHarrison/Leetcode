fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
    val reqDist = 3
    var currDist = 1
    var newFlowers = 0
    
    for (posi in 0 until flowerbed.size) {
        if(flowerbed[posi] == 1) {
            currDist = 0
            continue
        }

        currDist += 1
        if(currDist == reqDist || (currDist == 2 && posi == flowerbed.size - 1)) {
            newFlowers += 1
            currDist = 1
        }
    }

    return newFlowers >= n
}
fun predictPartyVictory(senate: String): String {
    val radiants = ArrayDeque<Int>()
    val dires = ArrayDeque<Int>()

    for ((idx, person) in senate.withIndex()) {
        if (person == 'R') radiants.addLast(idx)
        if (person == 'D') dires.addLast(idx)
    }

    var posi = 0

    while (true) {
        if(posi >= radiants.size) {
            return "Dire"
        } else if (posi >= dires.size) {
            return "Radiant"
        }

        if(radiants[posi] > dires[posi]) {
            dires.addLast(dires[posi] + senate.length)
        } else if(dires[posi] > radiants[posi]) {
            radiants.addLast(radiants[posi] + senate.length)
        }

        posi += 1
    }
}
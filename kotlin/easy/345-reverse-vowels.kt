fun reverseVowels(s: String): String {
    val vowels = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    val builder = StringBuilder(s)
    var leftPosi = 0
    var rightPosi = s.length - 1

    while (leftPosi < rightPosi) {
        while(!vowels.contains(s.get(leftPosi)) && leftPosi != rightPosi) {
            leftPosi += 1
        }

        while(!vowels.contains(s.get(rightPosi)) && leftPosi != rightPosi) {
            rightPosi -= 1
        }

        if(leftPosi != rightPosi) {
            builder.setCharAt(leftPosi, s.get(rightPosi))
            builder.setCharAt(rightPosi, s.get(leftPosi))
            leftPosi += 1
            rightPosi -= 1
        }
    }

    return builder.toString()
}
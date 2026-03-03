fun isSubsequence(s: String, t: String): Boolean {
    var sPosi = 0
    
    if(s.length == 0) {
        return true
    }

    for (char in t.toCharArray()) {
        if(char == s.get(sPosi)) {
            sPosi += 1
            
            if(sPosi >= s.length) {
                return true
            }
        }
    }   

    return false
}
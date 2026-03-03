fun pairSum(head: ListNode?): Int {
    var prev: ListNode? = null
    var curr: ListNode? = head
    var next: ListNode? = head?.next

    var fast: ListNode? = head?.next
    
    while(fast != null && curr?.next != null) {
        curr.next = prev
        prev = curr
        curr = next
        next = next?.next
        fast = fast?.next?.next
    }

    var currReversed = prev
    var currForward = curr
    var largestSum = 0

    while(currReversed != null && currForward != null) {
        largestSum = maxOf(largestSum, currReversed.`val` + currForward.`val`)

        currReversed = currReversed?.next
        currForward = currForward?.next
    }

    return largestSum
}
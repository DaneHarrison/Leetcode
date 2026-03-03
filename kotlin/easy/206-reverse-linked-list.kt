fun reverseList(head: ListNode?): ListNode? {
    if(head?.next == null) {
        return head
    }

    var prev: ListNode? = null
    var curr: ListNode? = head
    var next: ListNode? = head?.next

    while(curr != null) {
        curr.next = prev
        prev = curr
        curr = next
        next = next?.next
    }

    return prev
}
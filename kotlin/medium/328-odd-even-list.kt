fun oddEvenList(head: ListNode?): ListNode? {
    if (head?.next == null) return head

    var odd: ListNode? = head
    val evenHead: ListNode? = head.next
    var even: ListNode? = evenHead

    while (even?.next != null) {
        odd?.next = even.next
        odd = odd?.next

        even.next = odd?.next
        even = even.next
    }

    odd?.next = evenHead
    
    return head
}

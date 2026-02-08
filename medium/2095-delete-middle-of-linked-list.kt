fun deleteMiddle(head: ListNode?): ListNode? {
if (head == null || head.next == null) return null

    var prev = head
    var slow = head
    var fast = head.next

    while (fast != null) {
        if(prev != slow) {
            prev = prev?.next
        }

        slow = slow?.next
        fast = fast?.next?.next
    }

    if(prev != null && slow != null) {
        prev.next = slow.next    
    }

    return head
}
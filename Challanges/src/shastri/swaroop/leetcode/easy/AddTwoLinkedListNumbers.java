package shastri.swaroop.leetcode.easy;
/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
 */
class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class AddTwoLinkedListNumbers {
	public static void main(String... arg) {
		AddTwoLinkedListNumbers abc = new AddTwoLinkedListNumbers();
		ListNode l10 = new ListNode(2);
		ListNode l11 = new ListNode(4);
		ListNode l12 = new ListNode(3);

		ListNode l20 = new ListNode(5);
		ListNode l21 = new ListNode(6);
		ListNode l22 = new ListNode(4);

		l10.next = l11;
		l11.next = l12;

		l20.next = l21;
		l21.next = l22;

		ListNode node = abc.addTwoNumbers(l10, l20);
		System.out.println(node.val);
		while (node.next != null) {
			System.out.println(node.val);
			node = node.next;
		}
		System.out.println(abc.addTwoNumbers(l10, l20).val);
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int tmpNum = 0;
		int carry = 0;
		ListNode firstNode = null;
		ListNode lastNode;
		if (l1 != null && l2 != null) {
			tmpNum = l1.val + l2.val;
			if (tmpNum < 10) {
				firstNode = new ListNode(tmpNum);
			} else {
				firstNode = new ListNode(tmpNum % 10);
				carry = tmpNum / 10;
			}
			lastNode = firstNode;
			if (l1.next == null && l2.next == null) {
				if (tmpNum < 10) {
					return firstNode;
				}
				firstNode.next = new ListNode(carry);
				return firstNode;
			}

			int l1number = 0;
			int l2number = 0;

			tmpNum = 0;

			while (l1.next != null || l2.next != null) {
				if (l1.next != null) {
					l1number = l1.next.val;
					tmpNum = tmpNum + l1number;
				}
				if (l2.next != null) {
					l2number = l2.next.val;
					tmpNum = tmpNum + l2number;
				}
				tmpNum = tmpNum + carry;

				carry = 0;

				ListNode newNode = new ListNode(0);
				if (tmpNum < 10) {
					newNode.val = tmpNum;
					carry = 0;
				} else {
					newNode.val = tmpNum % 10;
					carry = tmpNum / 10;
					tmpNum = 0;
				}
				lastNode.next = newNode;
				lastNode = newNode;

				if (l1.next != null) {
					l1 = l1.next;
					tmpNum = 0;
				}
				if (l2.next != null) {
					l2 = l2.next;
					tmpNum = 0;
				}
			}
			if (carry != 0) {
				lastNode.next = new ListNode(carry);
			}
		}

		return firstNode;
	}
}

package com.javastack.deb;
import java.util.Scanner;
public class Stack {
	static Scanner SC = new Scanner(System.in);
	static int stack[], Stacksize, top = -1;
	static {
		create();
	}
	private static boolean isEmpty() {
		if (top == -1) {
			return true;
		} else {
			return false;
		}
	}

	private static int peek() {

		if (isEmpty()) {
			System.out.println("stack isempty!");
		}
		return stack[top];
	}

	private static int pop() {
		if (isEmpty()) {
			System.out.println("stack is empty");
			return 0;
		} else {
			return stack[top--];
		}
	}

	private static void traverseStack() {
		for (int i = top; i >= 0; i--) {
			System.out.print(stack[i] + " ");
		}
	}

	private static void push(int item) {
		if (Stacksize - 1 == top) {
			System.out.println("Stack is full!");
		} else {
			stack[++top] = item;
			System.out.println("Inserted sucessfully!" + item);
		}
	}

	private static void create() {
		System.out.print("Enter size of the stack::");
		Stacksize = Stack.SC.nextInt();
		stack = new int[Stacksize];
	}

	public static void main(String args[]) {
		while (true) {
			int userChoice;
			System.out.println("Stack Operations");
			System.out.println("Press 1 for Push");
			System.out.println("Press 2 for Pop");
			System.out.println("Press 3 for Peek");
			System.out.println("Press 4 for traverse");
			System.out.println("Press 5 for Exit");
			System.out.println("-------Enter your choice---------");
			System.out.print("Enter Here-->");
			userChoice = SC.nextInt();
			switch (userChoice) {
			case 1:
				try {
					push(SC.nextInt());
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.print("Push Elements");
				break;
			case 2:
				System.out.println("-----PopElements-----");
				try {
					pop();
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 3:
				try {
					System.out.println("Peek Element = " + peek());
				} catch (Exception e) {
					System.out.println("Error : " + e.getMessage());
				}
				break;
			case 4:
				traverseStack();
				System.out.print("TraverseElements");
				break;
			case 5:
				System.out.print("Exit sucessfully! Thank you");
				System.exit(0);
			default:
				System.out.print("Invalid input");
				break;
			}
		}
	}
}

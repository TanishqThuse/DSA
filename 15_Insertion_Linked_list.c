#include<stdio.h>
#include<stdlib.h>

struct Node {
		int data;
		struct Node* next;
};

void LinkedListTraversal(struct Node* pointer)
{
	while(pointer!=NULL)
	{
		printf("Element : %d\n", pointer->data);
		// pointer = pointer->next;
		pointer = pointer->next;
	}

}
int main()
{
	struct Node * head; 
	struct Node * second ;
	struct Node * third;
	struct Node * forth;

	//Allocating memory for nodes in the head
	head = (struct Node *) malloc(sizeof(struct Node));
	second = (struct Node *) malloc(sizeof(struct Node));
	third = (struct Node *) malloc(sizeof(struct Node));
	forth = (struct Node *) malloc(sizeof(struct Node));

	//Linking first and second nodes
	head->data = 7;
	head->next = second;

	//Creating second list and connectiong to third
	second->data = 19; //-> operator is very useful
	second->next = third;

	
	//Printing head node data and it's pointer location :


	third->data = 890;
	third->next = forth ;
	forth->data = 92834;
	forth->next = NULL;

	//Now i will try to insert node myself
	
	printf("Before inserting node in Linked List\n");
	LinkedListTraversal(head);
	//Now i have to add something
	// struct Node* prt = (struct Node*) malloc(sizeof(struct Node*));
	// struct Node* p = (struct Node*) malloc(sizeof(struct Node*));
	
	// prt->next = head->next;
	
	printf("After insertion in the beginning\n");
	
	struct Node * FIRST;
	FIRST = (struct Node*) malloc(sizeof(struct Node));

	FIRST->data = 0; 
	FIRST->next = head;

	//Is this enough?? NO, we have to change HEAD's pointer to point towards second element
	head->next = second;

	LinkedListTraversal(FIRST);

//	printf("Head data = %d\n",head->data);
//	printf("HEad location = %u\n",Node->next);
	return 0;
}

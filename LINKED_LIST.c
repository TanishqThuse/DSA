#include<stdio.h>
// #include<cstdlib>
#include<stdlib.h>
struct Node{
	int data;
	struct Node * next ; //Note this is a pointer of the same struct type
};

void LinkedListTraversal(struct Node* pointer)
{
	while(pointer!=NULL)
	{
		printf("Element : %d\n", pointer->data);
		pointer = pointer->next;
	}

}
int main()
{
	struct Node * head; 
	struct Node * second ;
	struct Node * third;

	//Allocating memory for nodes in the head
	head = (struct Node *) malloc(sizeof(struct Node));
	second = (struct Node *) malloc(sizeof(struct Node));
	third = (struct Node *) malloc(sizeof(struct Node));

	//Linking first and second nodes
	head->data = 7;
	head-> next = second;

	//Creating second list and connectiong to third
	second->data = 19; //-> operator is very useful
	second->next = third;

	third->data = 890;
	third->next = NULL ;
	
	//cALLING AN obect which can be used for LINKED LIST
	//Printing head node data and it's pointer location :
	LinkedListTraversal(head);

//	printf("Head data = %d\n",head->data);
//	printf("HEad location = %u\n",Node->next);
	return 0;
}



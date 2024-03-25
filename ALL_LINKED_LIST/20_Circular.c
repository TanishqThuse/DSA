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

void CircularLinkedListDisplay(struct Node* head)
{
    struct Node* ptr = (struct Node*)malloc(sizeof(struct Node));
    ptr->next = head;
	do
	{
		printf("Element : %d\n", ptr->data);
		// pointer = pointer->next;
		ptr = ptr->next;
	}while(ptr->next!=head);

}

struct Node* InsertCircularListInBetween(struct Node* head,int index,int data1)
{
    struct Node* ptr = (struct Node*)malloc(sizeof(struct Node));
    struct Node* p = (struct Node*)malloc(sizeof(struct Node));
    // struct Node* p 
    //Assuming the index is not 0
    p->next = head;
    // struct Node* p_ke_1_forward = (struct Node*)malloc(sizeof(struct Node));
    // p_ke_1_forward->next = head->next;
    int i=0;
    do{
       
        if(i==index-1)
        {
            // struct Node* ptr2 = p;
            // ptr2->next = ptr;
            ptr->data = data1;
            ptr->next = p->next;
            p->next = ptr;
            // free(p);
        } 
        p = p->next;
    }while(p->next!=head);
    return head;
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

	//Deleting the head : 
    //Display initial :
    printf("\nOriginal List\n"); 
    CircularLinkedListDisplay(head);
    // LinkedListTraversal(head);

    //Now Imma gonna try create a circular linked list
    // forth->next = head;
    // LinkedListTraversal(head); //This will print infinite times as the list is getting continued



    printf("\nAfter inserting one element in linked List\n"); 
    //Now I insert in between a linked List 
    head = InsertCircularListInBetween(head,2,345);
    forth->next = head;
    CircularLinkedListDisplay(head);
    return 0;
}
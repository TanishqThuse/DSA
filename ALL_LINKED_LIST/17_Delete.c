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

struct Node* DeleteHead(struct Node* head)
{
   // struct Node* ptr = (struct Node*) malloc(sizeof(struct Node));
    //struct Node* p = (struct Node*) malloc(sizeof(struct Node));
    
    struct Node* ptr = head;
    head = head->next;
    free(ptr);
    return head;
}

void DeleteAtIndex(struct Node* head, int index)
{
    struct Node* ptr = (struct Node*) malloc(sizeof(struct Node));
    //The above pointer is used ONLY for traversing
    ptr->next = head;
    for(int i=0 ; i<=index ; i++ )
    {
        ptr = ptr->next;
    }
    // struct Node* p = head;
    head = head->next;
    ptr =  head; 
    free(ptr);

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
    LinkedListTraversal(head);


    //Delete --> Also it is important to receive the new head as this is a copy being transfered to the new function 
    head = DeleteHead(head);
    

    printf("List after deleting it's head(index=0)\n");
    //Display
    LinkedListTraversal(head);

    //now we trunna detele the index at 2
    DeleteAtIndex(head , 2);

     printf("List after deleting it's index=2\n");
    //Display the new 
    LinkedListTraversal(head);
	return 0;
}
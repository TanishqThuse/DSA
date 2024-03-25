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

struct Node * InsertAtBeginning(struct Node * head , int data1)
{
    //creating a new structure node for at first
    struct Node* ptr = (struct Node*) malloc(sizeof(struct Node)); 
    ptr->next = head;
    ptr->data = data1;
    return ptr;
}

void InsertAtBetween(struct Node * head , int index , int data1)
{
    //First we create a linkedList Element
    struct Node* ptr = (struct Node*) malloc(sizeof(struct Node)); //this is the node to be included in linked list sequecen
    struct Node* p = (struct Node*) malloc(sizeof(struct Node)); //the only purpose of this node is to traverse to index

    int i=0;

    //first we initialise the ptr to head
    p->next = head;

    //First we traverse to the place before the actual index
    while(i<index)
    {
        p = p->next;
        i++;
    }
    ptr->data = data1;
    ptr->next = p->next;
    p->next = ptr; //ye thoda confusing he visualization me

}

// void InsertAtEnd(struct Node* head , int data1, int size_length)
// {
//     struct Node* ptr = (struct Node*) malloc(sizeof(struct Node));
//     struct Node* p = (struct Node*) malloc(sizeof(struct Node));

//     //initialize reference pointer to head for ese of travering
//     p->next = head;
//     int index = size_length;
//     int i=0;
//     //travserse fast
//     while(i<index)
//     {
        
//         if(p->next = NULL)
//         {
//             ptr->data = data1;
//             // ptr->next = p->next; -->I belive this will give exception
//             ptr->next = p->next; //since ibelive ptr was last
//             p->next = ptr; // ye to raat ke chal rha hu iska kya matlab hayein?
//         }
//         else{
//             p = p->next;
//         }
//         i++;
//     }
// }

void InsertAtEnd(struct Node* head,int data1)
{
    struct Node* ptr = (struct Node*) malloc(sizeof(struct Node));
    struct Node* p = (struct Node*) malloc(sizeof(struct Node));


    p->next = head;

    while(p->next != NULL){

        p = p->next;
    }

    ptr->next = NULL;
    p->next = ptr;
    ptr->data = data1;
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
	//the only before calling is changin head to new head which is reurned
    head = InsertAtBeginning(head,0);
	

	LinkedListTraversal(head);

    //Now we gotta insert at between
    InsertAtBetween(head , 2 , 8980);



    //now we will do insert at the end
    printf("\nAFTER INSERTING AT LASTTT\n");
    InsertAtEnd(head, 69 );
    LinkedListTraversal(head);

//	printf("Head data = %d\n",head->data);
//	printf("HEad location = %u\n",Node->next);
	return 0;
}

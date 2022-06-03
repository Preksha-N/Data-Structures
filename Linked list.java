   /******************************   Operations on Linked List    ****************************/


#include <stdio.h>
#include <stdlib.h>
struct node
{

  int data;

  struct node *link;

};

typedef struct node NODE;


void display (struct node *head)
{

  NODE *ptr = head;


  while (ptr != NULL)

    {

      printf ("%d\n", ptr->data);

      ptr = ptr->link;

    }

}



NODE *insertionAtFirst (NODE * head, int number)
{

  NODE *ptr = (NODE *) malloc (sizeof (NODE));

  ptr->data = number;

  ptr->link = head;

  head = ptr;

  return head;

}



NODE *insertInMiddle (NODE * head, int number, int index)
{

  NODE *ptr = head;

  NODE *value = (NODE *) malloc (sizeof (NODE));

  int i = 0;

  while (i != index - 1)

    {

      ptr = ptr->link;

      i++;

    }

  value->data = number;

  value->link = ptr->link;

  ptr->link = value;

  return head;

}



NODE *insertAtEnd (NODE * head, int number)
{

  NODE *ptr = head;

  NODE *value = (NODE *) malloc (sizeof (NODE));

  while (ptr->link != NULL)
    {

      ptr = ptr->link;

    }

  value->data = number;

  ptr->link = value;

  value->link = NULL;

  return head;

}



NODE *deleteAtFirst (NODE * head)
{

  struct node *ptr = head;

  head = head->link;

  free (ptr);

  return head;

}



NODE *deleteAtMiddle (NODE * head, int index)
{

  NODE *ptr = head;

  NODE *value = head->link;

  int i = 0;

  while (i != index - 1)
    {

      ptr = ptr->link;

      value = value->link;

    }

  ptr->link = value->link;

  free (value);

  return head;

}


NODE *deleteAtEnd (NODE * head)
{

  NODE *ptr = head;

  NODE *value = head->link;

  while (value->link != NULL)
    {

      ptr = ptr->link;

      value = value->link;

    }

  ptr->link = NULL;

  free (value);

  return head;

}


int searchElement (NODE * head, int key)
{

  struct node *ptr = head;

  while (ptr->link != NULL)
    {

      if (ptr->data ==key)
	{

	  return ptr->data;

	}

      ptr = ptr->link;

    }

  return 0;

}



void main ()
{

  int a = 1, choice, key, index,number;

  NODE *head = NULL;

    for(;;){
        
    
      printf ("Enter your choice\n");

      scanf ("%d", &choice);

      switch (choice)

	{


	case 1:
	  display(head);

	  break;

	case 2:
	  printf ("Enter the number\n");

	  scanf ("%d", &number);

	  head = insertionAtFirst (head, number);

	  break;

	case 3:
	  printf ("Enter the element: ");

	  scanf ("%d", &number);

	  printf ("Enter the index: ");

	  scanf ("%d", &index);

	  head = insertInMiddle (head, number, index);

	  break;

	case 4:
	  printf ("Enter the element: ");

	  scanf ("%d", &number);

	  head = insertAtEnd (head, number);

	  break;

	case 5:
	  head = deleteAtFirst (head);

	  break;

	case 6:
	  printf ("Enter the index: ");

	  scanf ("%d", &index);

	  deleteAtMiddle (head, index);

	  break;

	case 7:
	  deleteAtEnd (head);

	  break;

	case 8:
	  printf ("Enter the element\n");

	  scanf ("%d", &key);

	  int num = searchElement (head, key);

	  if (num == key)
	    {

	      printf ("Element found\n");

	    }
	  else
	    {

	      printf ("Element not found\n");

	    }

	  break;


	default:exit (0);
	
	}
    }

}

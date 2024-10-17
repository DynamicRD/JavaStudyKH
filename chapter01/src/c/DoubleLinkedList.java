/*#include <stdio.h>
#include <stdlib.h>
#pragma warning(disable:4996)

typedef struct node
{
	struct node* next;
	struct node* prev;
	int value;
}node;

node* head = NULL;
node* tail = NULL;

void addFrontNode(int data);
void addRearNode(int data);
node* newNode(int data);
void removeFrontNode();
void removeRearNode();
void nodeTraversal();

int main()
{
	int choice,data;
	while(1)
	{
		printf("----이중연결리스트----\n");
		printf("1.앞노드 추가.\n");
		printf("2.뒷노드 추가.\n");
		printf("3.앞노드 제거.\n");
		printf("4.뒷노드 제거.\n");
		printf("5.노드 순회.\n");
		printf("10. 종료.\n");
		scanf("%d",choice);
		switch(choice)
		{
		case 1:
			printf("정수를 입력하세요: ");
			scanf("%d",data);
			addFrontNode(data);
			break;
		case 2:
			printf("정수를 입력하세요: ");
			scanf("%d",data);
			addRearNode(data);
			break;
		case 3:
			removeFrontNode();
			break;
		case 4:
			removeRearNode();
			break;
		case 5:
			break;
		case 10:
			exit(0);
			break;
		}
		system("pause");
		system("cls");
	}	
	return 0;
}

void addFrontNode(int data)
{
	node* curNode = newNode(data);
	if(curNode == NULL)
	{
		return;
	}
	curNode->next = head;
	head->prev = curNode;
	head = curNode;
	printf("앞노드 추가\n");
}

void addRearNode(int data)
{
	node* curNode = newNode(data);
	if(curNode == NULL)
	{
		return;
	}
	curNode->prev = tail;
	tail->next = curNode;
	tail = curNode;	
	printf("뒷노드 추가\n");
}

node* newNode(int data)
{
	node* newNode = (node*)malloc(sizeof(node));
	newNode->next = NULL;
	newNode->prev = NULL;
	newNode->value = data;
	if(head == NULL)
	{
		head = newNode;
		tail = newNode;
		printf("새 노드 추가(첫번째 노드)\n");
		return null;
	}
	return newNode;
}

void removeFrontNode()
{
	if(head == NULL)
	{
		printf("삭제할 노드가 없습니다.\n");
		return;
	}
	node* curNode = head;
	if(head == tail)
	{
		free(curNode);
		head = NULL;
		tail = NULL;
		printf("삭제완료\n");
		return;
	}
	head->next->prev = NULL;
	head = curNode->next;
	free(curNode);
	printf("삭제완료\n");
}

void removeRearNode()
{
	if(head == NULL)
	{
		printf("삭제할 노드가 없습니다.\n");
		return;
	}
	node* curNode = tail;
	if(head == tail)
	{
		free(curNode);
		head = NULL;
		tail = NULL;
		printf("삭제완료\n");
		return;
	}
	tail->prev->next = NULL;
	tail = curNode->prev;
	free(curNode);
	printf("삭제완료\n");
}

void nodeTraversal()
{
	if(head == NULL)
	{
		printf("연결리스트가 구성되지않아 출력할수없습니다.\n");
		return;
	}
	node* curNode = head;
	printf("연결리스트: %d",curNode->value);
	while(curNode->next != NULL)
	{
		curNode = curNode->next;
		printf("-%d",curNode->value);
	}
}*/
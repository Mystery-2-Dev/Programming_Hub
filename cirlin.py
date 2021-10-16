class Node:    
    def __init__(self,data):    
        self.data = data;    
        self.previous = None;    
        self.next = None;    
            
class InsertEnd:    
    #Represent the head and tail of the doubly linked list    
    def __init__(self):    
        self.head = None;    
        self.tail = None;    
            
    #addAtEnd() will add a node to the end of the list    
    def addAtEnd(self, data):    
        #Create a new node    
        newNode = Node(data);    
            
        #If list is empty    
        if(self.head == None):    
            #Both head and tail will point to newNode    
            self.head = self.tail = newNode;    
            #head's previous will point to None    
            self.head.previous = None;    
            #tail's next will point to None, as it is the last node of the list    
            self.tail.next = None;    
        #Add newNode as new tail of the list    
        else:    
            #newNode will be added after tail such that tail's next will point to newNode    
            self.tail.next = newNode;    
            #newNode's previous will point to tail    
            newNode.previous = self.tail;    
            #newNode will become new tail    
            self.tail = newNode;    
            #As it is last node, tail's next will point to None    
            self.tail.next = None;    
                
    #display() will print out the nodes of the list    
    def display(self):    
        #Node current will point to head    
        current = self.head;    
        if(self.head == None):    
            print("List is empty");    
            return;    
        print("Adding a node to the end of the list: ");    
        while(current != None):    
            #Prints each node by incrementing pointer.    
            print(current.data),    
            current = current.next;    
                
        print();    
            
dList = InsertEnd();    
     
#Adding 1 to the list    
dList.addAtEnd(1);    
dList.display();    
#Adding 2 to the list    
dList.addAtEnd(2);    
dList.display();    
#Adding 3 to the list    
dList.addAtEnd(3);    
dList.display();    
#Adding 4 to the list    
dList.addAtEnd(4);    
dList.display();    
#Adding 5 to the list    
dList.addAtEnd(5);    
dList.display();    

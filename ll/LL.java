class LL{
    Node head;

    class Node{
    String data;
    Node next;

    Node(String data){
        this.data=data;
        this.next=null;
    }
}
public void addfirst(String data){
    Node newNode=new Node(data);
    if(head==null){
        head=newNode;
        return;
    }
    newNode.next=head;
    head=newNode;
}

public void addlast(String data){
    Node newNode=new Node(data);
    if(head==null){
        head=newNode;
        return;
    }
    Node curr=head;
    while(curr.next!=null){
        curr=curr.next;
    }
    curr.next=newNode;
}

public void print(){
    Node curr=head;
    if(head==null){
        System.out.println("Empty list");
    }
    while(curr!=null){
        System.out.print(curr.data + " -> ");
        curr=curr.next;
    }

    System.out.print("NULL");
}

    public static void main(String args[]){
        LL list =new LL();
        list.addfirst("A");
        list.addlast("name");
        list.print();
    }
}
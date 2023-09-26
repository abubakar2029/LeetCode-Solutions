class Node {
    constructor(data, next = null) {
        this.data = data;
        this.next = next;
    }
}

class LinkedList {
    constructor() {
        this.head = null;
        this.size = 0;
    }

    // insert forst node
    insertFirst(data) {
        this.head = new Node(data, this.head);
    }

    // insert last node

    // insert at index

    // print list data
    printListData() {
        let current = this.head;

        while (current) {
            console.log(current.data);
            current = current.next;
        }
    }
}

let aho = new LinkedList;
// aho.insertFirst(22)
aho.insertFirst(23)
aho.printListData()
console.log(aho.head);
console.log(aho.size);
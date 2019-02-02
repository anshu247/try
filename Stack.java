class Stack{
	int Stack[]=new int[10];
	int bottomofStack;
    Stack()
    {
    	bottomofStack= -1;

    }
    boolean isEmpty()
    {
    	 return(bottomofStack== -1);
            

}
    
    int spaceLeft()
    {
    	return (9- bottomofStack);

    }
    boolean isFull()
    {
    	return (bottomofStack==9);
           


            }
            void  push(int x) throws Exception
            {
                if(bottomofStack==9)
                {
                    throw new Exception("is Full");


                }
                else
                {
                   Stack[++bottomofStack]=x;

                }
            }
            int  pop() throws Exception
            {
                if(bottomofStack==-1)
                {
                    throw new Exception("is empty");

                }
                else
                {
                   int x= Stack[bottomofStack--];
                   return x;

                }

            }
            












    void displayStack()
    {
        if (isEmpty())
            System.out.println("Stack is empty");
        else
        {
            System.out.println("Stack is: ");
            for (int count = 0;count<(bottomofStack+1);count++)
                System.out.println(Stack[count]);
        }
    }
}
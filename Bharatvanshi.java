class bharatvanshi{
    void fight()
    {
        System.out.println("All bharatvanshi's were fighters.");
    }
    
    abstract void kind();
    abstract void obey();
}

class pandavs extends bharatvanshi{
    
    void fight()
    {
        System.out.println("All pandavs were fighters.");
    }
    
    abstract void kind();
    abstract void obey();
    
}

class kauravs extends bharatvanshi{
    
    void fight()
    {
        System.out.println("All kauravas were fighters.");
    }
    
    abstract void kind(){
        System.out.println("Kauravas were Cruel.")
    }
    abstract void obey("");
    
}
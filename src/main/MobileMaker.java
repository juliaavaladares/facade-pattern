package main;

public class MobileMaker {
    private LojaMobile iphone;
    private LojaMobile samsung;
    private LojaMobile xiomi;
    
    
    public MobileMaker() {
        this.iphone = new Iphone();
        this.samsung = new Samsung();
        this.xiomi = new Xiomi();
    }
 
    public void iphoneVenda(){  
        iphone.modelo();  
        iphone.preco();  
    }  
    
    public void samsungVenda(){  
        samsung.modelo();  
        samsung.preco();  
    }

    public void xiomiVenda(){  
        xiomi.modelo();  
        xiomi.preco();  
    }  
}

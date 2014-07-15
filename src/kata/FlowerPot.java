package kata;

public class FlowerPot {
    
    private int _lifeLevel = 0;
    private int _maxLifeLevel = 0;
    private Flower _state = Flower.GOOD;
    
    public FlowerPot() {
    
        this._lifeLevel = 5;
        this._maxLifeLevel = 5;
        
    }
    
    public int getLifeLevel() {
        return _lifeLevel;
    }

    public Flower setLifeLevel(int amount) {
        
        int current = this.getLifeLevel() + amount;
        
        if(current < 0) current = 0;
        if(current > this._maxLifeLevel) current = this._maxLifeLevel;
        
        this._lifeLevel = current;
        return setState(current);
    }

    public Flower getState() {
        return _state;
    }
    
    private Flower setState(int lifeLevel) {
        
        switch(lifeLevel) {
            
            case 5: 
            case 4:
                this._state = Flower.GOOD;
                break;
            case 3:
            case 2:
            case 1:
                this._state = Flower.BAD;
                break;
            default:
                this._state = Flower.DEAD;
         
        } 
        
        return this._state;
        
        
    }
    
    
    

    
}

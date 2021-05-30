public class User{


int hp = 100;
int strength = 0;//random 
int lifePoints = 0;

//strength accessor
public void setStrength (int s)
{
this.strength = s;
}

public int getStrength ()
{
 return this.strength;
}
 
 
//life points accessor hit points  
public void setDamage (int p)
{
this.hp-= p;
}

public int gethp ()
{
 return this.hp;
}
 





} 
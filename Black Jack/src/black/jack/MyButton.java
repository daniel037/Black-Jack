/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package black.jack;

import javax.swing.JButton;

/**
 *
 * @author oop
 */
public class MyButton extends JButton {
    
    private int v;
    //----------------------------
    public MyButton(int v)
    {
        super("    ");
        this.v = v;
    }
    //------------------------------------
    public void show()
    {
        setText(""+v);
    }
    //----------------------------------
    public int getValue ()
    {
        return v;
    } 
}

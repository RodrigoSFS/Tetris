package tetrisblocks;

import tetriszao.TetrisBlock;

/**
 *
 * @author rodri
 */
public class IShape extends TetrisBlock
{
    public IShape()
    {
        super( new int[][]{ {1, 1, 1, 1} });
    }
    
    @Override
    public void rotateBlock()
    {
        super.rotateBlock();
        
        //está na vertical
        if( this.getWidth() == 1)
        {
            this.setX(this.getX() + 1);
            this.setY(this.getY() - 1);
        }
        else
        {
            this.setX(this.getX() - 1);
            this.setY(this.getY() + 1);
        }
    }
}

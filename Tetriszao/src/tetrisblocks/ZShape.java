package tetrisblocks;

import tetriszao.TetrisBlock;

/**
 *
 * @author rodri
 */
public class ZShape extends TetrisBlock
{
    public ZShape()
    {
        super(new int[][] { {1, 1, 0},
                            {0, 1, 1} 
        });
    }
}

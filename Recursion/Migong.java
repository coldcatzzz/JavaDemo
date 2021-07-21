package Recursion;

/*老鼠走迷宫
    1  1  1  1  1  1  1
    1  0  0  0  0  0  1
    1  0  0  0  0  0  1
    1  1  1  0  0  0  1
    1  0  0  0  0  0  1
    1  0  0  0  0  0  1
    1  0  0  0  0  0  1
    1  1  1  1  1  1  1
* */

public class Migong {
    public static void main(String[] args) {
        int[][] map = new int[8][7];
        for (int i = 0; i<map.length; i++){
            for (int j = 0; j<map[i].length; j++){
                if (i == 0 || i == 7 || j == 0 || j == 6){
                    map[i][j] = 1;
                }
                System.out.print(map[i][j] + "  ");
            }
            map[3][1] = 1;
            map[3][2] = 1;
            System.out.println();
        }

        Test04 t = new Test04();
        t.findWay(map, 1, 1);
        System.out.println("----------------------");
        for (int[] ints : map) {
            for (int anInt : ints) {
                System.out.print(anInt + "  ");
            }
            System.out.println();
        }
    }
}

class Test04{
    /*
    * 找到返回true
    * i,j为坐标，初始位置(1,1)
    * 0 可以走 1 障碍物 2 没走过，可以走 3 走过，但是走不通，是死路
    * map[6][5] == 2 表示找到出口，结束
    * 路线优先级 下 右 上 左
    * */
    public boolean findWay(int[][] map, int i, int j){
        if (map[6][5] == 2){
            return true;
        }else {
            if (map[i][j] == 0){
                map[i][j] = 2;
                if (findWay(map, i + 1, j)){
                    return true;
                }else if (findWay(map, i, j + 1)){
                    return true;
                }else if (findWay(map, i - 1, j)){
                    return true;
                }else if (findWay(map, i, j - 1)){
                    return true;
                }else {
                    map[i][j] = 3;
                    return false;
                }
            }else {
                return false;
            }
        }
    }
}

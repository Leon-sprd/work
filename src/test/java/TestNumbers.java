

import bodys.Cube;
import bodys.Cuboid;
import bodys.ShapeBody;
import org.junit.jupiter.api.Test;
import shapes.*;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class TestNumbers {

    @Test
    public void testMax() {
        int[] input = new int[]{5, 3, 8};
        int max = Numbers.max(input);
        assertThat(max).isEqualTo(8);
    }

    @Test
    public void testMaxWithNegativeNumbers() {
        int[] input = new int[]{-5, -3, -8};
        int max = Numbers.max(input);
        assertThat(max).isEqualTo(-3);
    }


    @Test
    public void testMin() {
        int[] input = new int[]{-3, -5, -1};
        int min = Numbers.min(input);
        assertThat(min).isEqualTo(-5);
    }

    @Test
    public void testSum() {

        int[] input = new int[]{};
        int min = Numbers.sum(input);
        assertThat(min).isEqualTo(0);
    }


    @Test
    public void testSumWithAList() {

        int[] input = new int[]{34, 78, 3};
        int min = Numbers.sum(input);
        assertThat(min).isEqualTo(115);
    }

    @Test
    public void testSumWithAList2() {

        int[] input = new int[]{1, 2, 3, 4};
        int min = Numbers.sum(input);
        assertThat(min).isEqualTo(10);
    }

    @Test
    public void testSumWithNegativeNumbers() {

        int[] input = new int[]{-1, 0, 2, -20};
        int min = Numbers.sum(input);
        assertThat(min).isEqualTo(-19);
    }

    @Test
    public void testAVG() {

        int[] input = new int[]{2, 4, 8};
        double min = Numbers.avg(input);
        assertThat(min).isEqualTo((double) 14 / 3);
    }

    @Test
    public void testGetPositiveNumber() {

        assertThat(Numbers.abs(-4)).isEqualTo(4);
        assertThat(Numbers.abs(4)).isEqualTo(4);
        assertThat(Numbers.abs(-5)).isEqualTo(5);
        assertThat(Numbers.abs(0)).isEqualTo(0);
        assertThat(Numbers.abs(-0)).isEqualTo(0);
    }

    @Test
    public void testFak0() {

        assertThat(Numbers.fak(0)).isEqualTo(1);
    }

    @Test
    public void testFak1() {

        assertThat(Numbers.fak(1)).isEqualTo(1);
    }


    @Test
    public void testFak2() {

        assertThat(Numbers.fak(2)).isEqualTo(2);

    }


    @Test
    public void testFak3() {


        assertThat(Numbers.fak(3)).isEqualTo(6);


    }


    @Test
    public void testFak4() {


        // assertThat(Numbers.fak(4)).isEqualTo(24);
        assertThat(Numbers.fak2(4)).isEqualTo(24);

    }


    @Test
    public void testRectangle() {

        Shape shape = new Rectangle(2, 3);
        assertThat(shape.computeArea()).isEqualTo(6);

    }


    @Test
    public void testTriangle() {

        Triangle triangle = new Triangle(2, 3);
        assertThat(triangle.computeArea()).isEqualTo(3);

    }

    @Test
    public void testCubeArea() {
        Cube cube = new Cube(6);
        assertThat(cube.computeArea()).isEqualTo(216);
    }

    @Test
    public void testCubeVolume() {
        Cube cube = new Cube(4);
        assertThat(cube.computeVolume()).isEqualTo(64);
    }

    @Test
    public void testCubePerimeter() {
        Cube cube = new Cube(7);
        assertThat(cube.computePerimeter()).isEqualTo(84);
    }

    @Test
    public void testCuboidArea() {
        Cuboid cuboid = new Cuboid(9, 2, 3);

        assertThat(cuboid.computeArea()).isEqualTo(102);
    }

    @Test
    public void testCuboidPerimeter() {
        Cuboid cuboid = new Cuboid(9, 3, 12);
        assertThat(cuboid.computePerimeter()).isEqualTo(96);
    }

    @Test
    public void testCuboidVolume() {
        Cuboid cuboid = new Cuboid(7, 17, 10);
        assertThat(cuboid.computeVolume()).isEqualTo(1190);
    }

    @Test
    public void testCuboidVolumeVsShapeBodyVolume() {

        Cuboid cuboid = new Cuboid(2, 3, 4);

        ShapeBody shapeBody = new ShapeBody(new Rectangle(2, 3), 4);

        assertThat(cuboid.computeVolume()).isEqualTo(shapeBody.computeVolume());
        assertThat(cuboid.computePerimeter()).isEqualTo(shapeBody.computePerimeter());
        assertThat(cuboid.computeArea()).isEqualTo(shapeBody.computeArea());
    }

    @Test
    public void testPointer() {
        Cuboid cuboid = new Cuboid(3, 5, 6);
        Cuboid cuboid2 = cuboid;
        assertThat(cuboid).isEqualTo(cuboid2);
        Cuboid cuboid3 = new Cuboid(3, 5, 6);
        // assertThat(cuboid).isEqualTo(cuboid3);
        Cuboid cuboidNull = null;
        cuboidNull = cuboid3;
        cuboidNull.computeArea();
        System.out.println(cuboid3.a);
        cuboid3.a = 198;
        System.out.println(cuboid3.a);
        System.out.println(cuboidNull.a);
        Cuboid cuboid3clone = cuboid3.clone();

    }

    @Test
    public void testPointer2() {



        new Cuboid(2, 3, 4);
        new Cuboid(2, 3, 4);
        new Cuboid(2, 3, 4);


    }


    private void foo(Rectangle leon) {
        leon.a++;
    }


}

public class Main {

    public static void main(String[] args) {
        String[] sArr = {"a", "b", "c"};
        Integer[] iArr = {1, 2, 3};

        System.out.println(sArr[0] + " " + sArr[2]);
        changeElems(sArr, 0, 2);
        System.out.println(sArr[0] + " " + sArr[2]);

        System.out.println(iArr[0].toString() + " " + iArr[2].toString());
        changeElems(iArr, 0, 2);
        System.out.println(iArr[0].toString() + " " + iArr[2].toString());

    }

    public static void changeElems(Object[] arr, int idxS, int idxD) {
        Object tmpElem = arr[idxS];
        arr[idxS] = arr[idxD];
        arr[idxD] = tmpElem;
    }
}

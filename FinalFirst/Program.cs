using System;
class Program
{
    public static void Main(string[] args)
    {
        String[] strArrOne = {"Hello", "2", "world", ":-)"};
        String[] resultstrArrOne = getShortValue(strArrOne);
        String[] strArrOneTwo = {"1234", "1567", "-2", "computer science"};
        String[] resultstrArrTwo = getShortValue(strArrOneTwo);
        String[] strArrThree = {"Russia", "Denmark", "Kazan"};
        String[] resultstrArrThree = getShortValue(strArrThree);
        printArr(resultstrArrOne);
        printArr(resultstrArrTwo);
        printArr(resultstrArrThree);
    }

    private static void printArr(string[] arr)
    {
        Console.ForegroundColor = ConsoleColor.Green;
        Console.Write("[");
        for (int i = 0; i < arr.Length; i++)
            {
                Console.ForegroundColor = ConsoleColor.Cyan;
                Thread.Sleep(1);
                Console.Write(arr[i]);
                if (i < arr.Length - 1)
                    System.Console.Write(", ");
            }
                Console.ForegroundColor = ConsoleColor.Green;
                Console.WriteLine("]");
                Console.ResetColor();
    }
    private static string[] getShortValue(string[] strArr)
    {
        int count = 0;
        for (int i = 0; i < strArr.Length; i++)
        {
            if (strArr[i].Length < 4)
            {
                count++;
            }
        }
        String[] resultstrArr = new String[count];
        int current_index = 0; if (count > 0)
        {
            for (int i = 0; i < strArr.Length; i++)
            {
                if (strArr[i].Length < 4)
                {
                    resultstrArr[current_index] = strArr[i];
                    current_index++;
                }
            }
        }
        return resultstrArr;
    }
}
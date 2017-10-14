public class Kata
{
  public static int dontGiveMeFive(int start, int end)
  { int count =0;
    for (int i = start ; i <= end;i++)
    {
    if(!(""+i).contains("5"))
    {
    count = count +1;
}

}
return count;
}
}
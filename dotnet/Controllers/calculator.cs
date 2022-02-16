using Microsoft.AspNetCore.Mvc;

namespace WebApplicationdemo1.Controllers
{
    public class calculator : Controller
    {
        public int add(int input1,int input2)
        {
            return input1 + input2;
        }
        public int sub(int input1, int input2)
        {
            return input1 - input2;
        }
    }
}

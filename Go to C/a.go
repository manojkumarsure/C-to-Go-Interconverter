package main
import "fmt"
func gen(y int) int{
return  20 + y
}
func main() {
var x,y int
for x= 0 ;x< 10 ;x++{
{
y=x*x + gen(0)
if x== 0 {
y=  0
}
fmt.Printf( "%d\n" ,y)
}
}
}

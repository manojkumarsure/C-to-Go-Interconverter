package main
import "fmt"
func gen() int{
return  20 
}
func main() int{
var x,y int
for x= 0 ;x< 10 ; ++x {
{
y=x*x+gen()
if x== 0 {
y=  0
}
fmt.Printf( "%d\n" ,y)
}
}
return  0 
}

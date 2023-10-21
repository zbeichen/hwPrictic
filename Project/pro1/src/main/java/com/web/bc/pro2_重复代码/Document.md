什么是重复代码：
在一个以上的地点看到相同或相似的代码结构
影响：
想要进行修改其中一段的代码逻辑，需要修改多次，容易遗漏，难以维护
目标：
消除重复，提升可维护性
方法：
提炼函数，移动语句，函数上移等


提取公共方法：ctrl+alt+m 或者 右击鼠标-refactor-extract method

代码上移：ctrl+alt+shift+t  -》 pull members up，或者右键-refactor

ctrl+shift+上下箭头移动代码，使得相同的代码在一起, 提取公共方法ctrl+alt+m （注意改名，public）
ctrl+alt+shift+t->extract delegate(创建委托，并调用)
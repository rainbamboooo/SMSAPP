# CS Final: SMS APP

Team Members:

李雨竹 2015530235

陈俊东 2015530515

肖采薇 2016530325

唐鹏今 2016530172

昌博文 2016530374

唐彬豪 2016530220

郑灏澜 2015530xxx

## 整体框架

![](https://github.com/rainbamboooo/SMSAPP/raw/master/img/1.png)

## 完成进度
 - 学生(抽象)类
 - 社团(抽象)类与接口
 - 书类
 - 二手书名搜索
 - 二手书价格排序
 - 社团根据学号或姓名搜索并添加学生
 - 根据当前GPA和期末占比计算拿A期末最少得分
 - 维权案申诉(自动发送邮件给权益部)

## 知识点(只展示部分)

### 变量声明/赋值 & 逻辑运算/数学运算

    double requireAScore = (90 - grade * (1 - percentage/100)) / (percentage/100);
    double requireBScore = (80 - grade * (1 - percentage/100)) / (percentage/100);

### 条件判断语句
    if (gender.equals("male") || gender.equals("female")){
        this.gender = gender;
    } else{
        System.out.println("Illegal input");
    }

### 循环语句

    public void searchBookName(Book[] data, String x){
        for (int i = 0; i < data.length; i++){
            int index = data[i].GetN().indexOf(x);
            if (index != -1){
                System.out.println(data[i].GetN());
            }
        }
    }

### 输入/输出

    System.out.println("Please enter your current grade(0-100): ");
    double grade = sc.nextInt();
    System.out.println("Please enter the percentage of final(1-100): ");
    double percentage = sc.nextInt();
    hf.computeFinal(grade, percentage);
    
### 强制类型转换/隐式类型转换

### 类定义/成员变量/函数

    class Book {
        String type;
        String name;
        int price;
        int degree;
    
        Book(String new_type, String new_name, int new_price, int new_degree){
            this.type = new_type;
            this.name = new_name;
            this.price = new_price;
            this.degree = new_degree;
        }
    }
    
### 抽象类 & 访问器修改器

    public abstract class Student {
        public String name;
        public String gender;
        public int schoolNumber;
        
        Student(String name, String gender, int number){
            this.name = name;
            this.gender = gender;
            this.schoolNumber = number;
        }
        
        public void setName(String name){
            this.name = name;
        }
        public void setGender(String gender){
            if (gender.equals("male") || gender.equals("female")){
                this.gender = gender;
            } else{
                System.out.println("Illegal input");
            }
        }
        
        public void setSchoolNumber(int number){
            if (number < 1000000000 || number > 1000000000){
                System.out.println("Illegal input");
                return;
            } else{
                this.schoolNumber = number;
            }
    
        }
    
        public String getName(){
            return this.name;
        }
        
        public String getGender(){
            return this.gender;
        }
        
        public int getSchoolNumber(){
            return this.schoolNumber;
        }
        
        // overload
        public String toString(){
            return "Name: " + name + "\tGender: " + gender + "\tSchool Number: " + schoolNumber;
        }
    }

### 类继承

    public class NormalStudent extends Student {
        NormalStudent(String name, String gender, int number){
            super(name, gender, number);
        }
    }

### 接口定义/使用 & 函数重载/重写

    public interface ClubOperation {
        void sendMessage(String content);
        void addMember(NormalStudent[] data, int n, int start, int end);
        void addMember(NormalStudent[] data, String name);
    }
    
    ...
    
    public class NormalClub extends Club implements ClubOperation {
        NormalClub(String name, NormalStudent[] members, String leader_name, String leader_email, String leader_phone){
            super(name, members, leader_name, leader_email, leader_phone);
        }
        
        HelperFunction hf = new HelperFunction();
        
        public void sendMessage(String content){
            // to be implemented
            return;
        }
        
        public void addMember(NormalStudent[] data, int number, int start, int end){
            hf.sortSchoolNumber(data);
            int index = hf.searchSchoolNumber(data, number, 0, -1);
            System.out.println(data[index].toString());
        }
        
        public void addMember(NormalStudent[] data, String name){
            hf.searchStudentName(data, name);
        }
        
    }

### 数组定义/遍历/赋值

    NormalStudent[] students = new NormalStudent[7];
    students[0] = new NormalStudent("liyuzhu", "male", 2015530235);
    students[1] = new NormalStudent("chenjundong", "male", 2015530515);
    students[2] = new NormalStudent("changbowen", "male", 2016530374);
    students[3] = new NormalStudent("tangbinhao", "male", 2016530220);
    students[4] = new NormalStudent("zhenghaolan", "male", 2015530235);
    students[5] = new NormalStudent("xiaocaiwei", "female", 2016530325);
    students[6] = new NormalStudent("tangpengjin", "female", 2016530172);
    for (int i = 0; i < students.length; i++){
        System.out.println(students[i].toString());
    }

### 递归 & 排序算法

    public int searchSchoolNumber(NormalStudent[] data, int x, int start, int end){
        if (end == -1){
            end = data.length;
        }
        if(start > end){  
            return -1;  
        }
        int mid = start + (end - start) / 2;  
        if(x < data[mid].getSchoolNumber()){  
            return searchSchoolNumber(data , x, start, mid-1);  
        }else if(x > data[mid].getSchoolNumber()){  
            return searchSchoolNumber(data, x, mid + 1, end);  
        }else{  
            return mid;  
        }  
    }

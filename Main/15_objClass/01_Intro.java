class Student{
    int rollNo;
    String Subject;

  
    public String toString() {
        return "Student [rollNo=" + rollNo + ", Subject=" + Subject + "]";
    }

    // public String toString(){
    //     return "Hello";
    // }

        public boolean equals(Student other){
            if(this.Subject.equals(other.Subject) && this.rollNo==other.rollNo){
                return true;
            }
            else{
                return false;
            }
        }

}

class LPU{
    public static void main(String args[]){
        Student obj1 = new Student();
        obj1.Subject = "JAVA";
        obj1.rollNo = 22;

        Student obj2 = new Student();
        obj2.Subject = "JAVA";
        obj2.rollNo = 22;

        // boolean ans = obj1 == obj2;
        // System.out.println(ans);

        // System.out.println(obj1.toString());
        // System.out.println(obj2.toString());


        System.out.println(obj1.equals(obj2));
    }
}



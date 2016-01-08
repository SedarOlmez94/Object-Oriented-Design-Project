import java.util.List;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;
import java.util.Vector;

import java.lang.*;
import java.lang.reflect.*;
import java.util.StringTokenizer;
import java.io.*;



class Staff
  implements SystemTypes
{
  private String staffId = ""; // internal
  private int costDay = 0; // internal
  private List assigned = new Vector(); // of Assignment
  private List has = new Vector(); // of Skill

  public Staff()
  {
    this.staffId = "";
    this.costDay = 0;

  }



  public String toString()
  { String _res_ = "(Staff) ";
    _res_ = _res_ + staffId + ",";
    _res_ = _res_ + costDay;
    return _res_;
  }

  public void setstaffId(String staffId_x) { staffId = staffId_x;  }


    public static void setAllstaffId(List staffs,String val)
  { for (int i = 0; i < staffs.size(); i++)
    { Staff staffx = (Staff) staffs.get(i);
      Controller.inst().setstaffId(staffx,val); } }


  public void setcostDay(int costDay_x) { costDay = costDay_x;  }


    public static void setAllcostDay(List staffs,int val)
  { for (int i = 0; i < staffs.size(); i++)
    { Staff staffx = (Staff) staffs.get(i);
      Controller.inst().setcostDay(staffx,val); } }


  public void setassigned(List assignedxx) { assigned = assignedxx;
    }
 
  public void addassigned(Assignment assignedxx) { assigned.add(assignedxx);
    }
 
  public void removeassigned(Assignment assignedxx) { Vector _removedassignedassignedxx = new Vector();
  _removedassignedassignedxx.add(assignedxx);
  assigned.removeAll(_removedassignedassignedxx);
    }

  public static void setAllassigned(List staffs,List _val)
  { for (int _i = 0; _i < staffs.size(); _i++)
    { Staff staffx = (Staff) staffs.get(_i);
      Controller.inst().setassigned(staffx, _val); } }

  public static void addAllassigned(List staffs,Assignment _val)
  { for (int _i = 0; _i < staffs.size(); _i++)
    { Staff staffx = (Staff) staffs.get(_i);
      Controller.inst().addassigned(staffx, _val); } }


  public static void removeAllassigned(List staffs,Assignment _val)
  { for (int _i = 0; _i < staffs.size(); _i++)
    { Staff staffx = (Staff) staffs.get(_i);
      Controller.inst().removeassigned(staffx, _val); } }


  public static void unionAllassigned(List staffs, List _val)
  { for (int _i = 0; _i < staffs.size(); _i++)
    { Staff staffx = (Staff) staffs.get(_i);
      Controller.inst().unionassigned(staffx, _val); } }


  public static void subtractAllassigned(List staffs, List _val)
  { for (int _i = 0; _i < staffs.size(); _i++)
    { Staff staffx = (Staff) staffs.get(_i);
      Controller.inst().subtractassigned(staffx, _val); } }


  public void sethas(List hasxx) { has = hasxx;
    }
 
  public void addhas(Skill hasxx) { has.add(hasxx);
    }
 
  public void removehas(Skill hasxx) { Vector _removedhashasxx = new Vector();
  _removedhashasxx.add(hasxx);
  has.removeAll(_removedhashasxx);
    }

  public static void setAllhas(List staffs,List _val)
  { for (int _i = 0; _i < staffs.size(); _i++)
    { Staff staffx = (Staff) staffs.get(_i);
      Controller.inst().sethas(staffx, _val); } }

  public static void addAllhas(List staffs,Skill _val)
  { for (int _i = 0; _i < staffs.size(); _i++)
    { Staff staffx = (Staff) staffs.get(_i);
      Controller.inst().addhas(staffx, _val); } }


  public static void removeAllhas(List staffs,Skill _val)
  { for (int _i = 0; _i < staffs.size(); _i++)
    { Staff staffx = (Staff) staffs.get(_i);
      Controller.inst().removehas(staffx, _val); } }


  public static void unionAllhas(List staffs, List _val)
  { for (int _i = 0; _i < staffs.size(); _i++)
    { Staff staffx = (Staff) staffs.get(_i);
      Controller.inst().unionhas(staffx, _val); } }


  public static void subtractAllhas(List staffs, List _val)
  { for (int _i = 0; _i < staffs.size(); _i++)
    { Staff staffx = (Staff) staffs.get(_i);
      Controller.inst().subtracthas(staffx, _val); } }


    public String getstaffId() { return staffId; }

    public static List getAllstaffId(List staffs)
  { List result = new Vector();
    for (int i = 0; i < staffs.size(); i++)
    { Staff staffx = (Staff) staffs.get(i);
      if (result.contains(staffx.getstaffId())) { }
      else { result.add(staffx.getstaffId()); } }
    return result; }

    public static List getAllOrderedstaffId(List staffs)
  { List result = new Vector();
    for (int i = 0; i < staffs.size(); i++)
    { Staff staffx = (Staff) staffs.get(i);
      result.add(staffx.getstaffId()); } 
    return result; }

    public int getcostDay() { return costDay; }

    public static List getAllcostDay(List staffs)
  { List result = new Vector();
    for (int i = 0; i < staffs.size(); i++)
    { Staff staffx = (Staff) staffs.get(i);
      if (result.contains(new Integer(staffx.getcostDay()))) { }
      else { result.add(new Integer(staffx.getcostDay())); } }
    return result; }

    public static List getAllOrderedcostDay(List staffs)
  { List result = new Vector();
    for (int i = 0; i < staffs.size(); i++)
    { Staff staffx = (Staff) staffs.get(i);
      result.add(new Integer(staffx.getcostDay())); } 
    return result; }

  public List getassigned() { return (Vector) ((Vector) assigned).clone(); }

  public static List getAllassigned(List staffs)
  { List result = new Vector();
    for (int _i = 0; _i < staffs.size(); _i++)
    { Staff staffx = (Staff) staffs.get(_i);
      result = Set.union(result,staffx.getassigned()); }
    return result; }

  public static List getAllOrderedassigned(List staffs)
  { List result = new Vector();
    for (int _i = 0; _i < staffs.size(); _i++)
    { Staff staffx = (Staff) staffs.get(_i);
      result = Set.union(result,staffx.getassigned()); }
    return result; }

  public List gethas() { return (Vector) ((Vector) has).clone(); }

  public static List getAllhas(List staffs)
  { List result = new Vector();
    for (int _i = 0; _i < staffs.size(); _i++)
    { Staff staffx = (Staff) staffs.get(_i);
      result = Set.union(result,staffx.gethas()); }
    return result; }

  public static List getAllOrderedhas(List staffs)
  { List result = new Vector();
    for (int _i = 0; _i < staffs.size(); _i++)
    { Staff staffx = (Staff) staffs.get(_i);
      result = Set.union(result,staffx.gethas()); }
    return result; }


}


class Assignment
  implements SystemTypes
{
  private Staff staff;
  private Task task;

  public Assignment(Staff staff,Task task)
  {
    this.staff = staff;
    this.task = task;

  }

  public Assignment() { }



  public void setstaff(Staff staffxx) { staff = staffxx;
  }

  public static void setAllstaff(List assignments,Staff _val)
  { for (int _i = 0; _i < assignments.size(); _i++)
    { Assignment assignmentx = (Assignment) assignments.get(_i);
      Controller.inst().setstaff(assignmentx, _val); } }

  public void settask(Task taskxx) { task = taskxx;
  }

  public static void setAlltask(List assignments,Task _val)
  { for (int _i = 0; _i < assignments.size(); _i++)
    { Assignment assignmentx = (Assignment) assignments.get(_i);
      Controller.inst().settask(assignmentx, _val); } }

  public Staff getstaff() { return staff; }

  public static List getAllstaff(List assignments)
  { List result = new Vector();
    for (int _i = 0; _i < assignments.size(); _i++)
    { Assignment assignmentx = (Assignment) assignments.get(_i);
      if (result.contains(assignmentx.getstaff())) {}
      else { result.add(assignmentx.getstaff()); }
 }
    return result; }

  public static List getAllOrderedstaff(List assignments)
  { List result = new Vector();
    for (int _i = 0; _i < assignments.size(); _i++)
    { Assignment assignmentx = (Assignment) assignments.get(_i);
      if (result.contains(assignmentx.getstaff())) {}
      else { result.add(assignmentx.getstaff()); }
 }
    return result; }

  public Task gettask() { return task; }

  public static List getAlltask(List assignments)
  { List result = new Vector();
    for (int _i = 0; _i < assignments.size(); _i++)
    { Assignment assignmentx = (Assignment) assignments.get(_i);
      if (result.contains(assignmentx.gettask())) {}
      else { result.add(assignmentx.gettask()); }
 }
    return result; }

  public static List getAllOrderedtask(List assignments)
  { List result = new Vector();
    for (int _i = 0; _i < assignments.size(); _i++)
    { Assignment assignmentx = (Assignment) assignments.get(_i);
      if (result.contains(assignmentx.gettask())) {}
      else { result.add(assignmentx.gettask()); }
 }
    return result; }

    public String toString()
  {   String result = "";
 
  result = task.gettaskId() + ", " + task.getduration() + ", " + staff.getstaffId() + ", " + staff.getcostDay();
    return result;
  }


    public int cost()
  {   int result = 0;
 
  result = staff.getcostDay() * task.getduration();
    return result;
  }


    public void displayschedule1()
  {   System.out.println("" + this);

  }

    public void cleartasks1()
  { Controller.inst().killTask(this.gettask());
  }


}


class Task
  implements SystemTypes
{
  private String taskId = ""; // internal
  private int duration = 0; // internal
  private List assignment = new Vector(); // of Assignment
  private List dependsOn = new Vector(); // of Task
  private List needs = new Vector(); // of Skill

  public Task()
  {
    this.taskId = "";
    this.duration = 0;

  }



  public String toString()
  { String _res_ = "(Task) ";
    _res_ = _res_ + taskId + ",";
    _res_ = _res_ + duration;
    return _res_;
  }

  public void settaskId(String taskId_x) { taskId = taskId_x;  }


    public static void setAlltaskId(List tasks,String val)
  { for (int i = 0; i < tasks.size(); i++)
    { Task taskx = (Task) tasks.get(i);
      Controller.inst().settaskId(taskx,val); } }


  public void setduration(int duration_x) { duration = duration_x;  }


    public static void setAllduration(List tasks,int val)
  { for (int i = 0; i < tasks.size(); i++)
    { Task taskx = (Task) tasks.get(i);
      Controller.inst().setduration(taskx,val); } }


  public void setassignment(List assignmentxx) { assignment = assignmentxx;
    }
 
  public void addassignment(Assignment assignmentxx) { assignment.add(assignmentxx);
    }
 
  public void removeassignment(Assignment assignmentxx) { Vector _removedassignmentassignmentxx = new Vector();
  _removedassignmentassignmentxx.add(assignmentxx);
  assignment.removeAll(_removedassignmentassignmentxx);
    }

  public static void setAllassignment(List tasks,List _val)
  { for (int _i = 0; _i < tasks.size(); _i++)
    { Task taskx = (Task) tasks.get(_i);
      Controller.inst().setassignment(taskx, _val); } }

  public static void addAllassignment(List tasks,Assignment _val)
  { for (int _i = 0; _i < tasks.size(); _i++)
    { Task taskx = (Task) tasks.get(_i);
      Controller.inst().addassignment(taskx, _val); } }


  public static void removeAllassignment(List tasks,Assignment _val)
  { for (int _i = 0; _i < tasks.size(); _i++)
    { Task taskx = (Task) tasks.get(_i);
      Controller.inst().removeassignment(taskx, _val); } }


  public static void unionAllassignment(List tasks, List _val)
  { for (int _i = 0; _i < tasks.size(); _i++)
    { Task taskx = (Task) tasks.get(_i);
      Controller.inst().unionassignment(taskx, _val); } }


  public static void subtractAllassignment(List tasks, List _val)
  { for (int _i = 0; _i < tasks.size(); _i++)
    { Task taskx = (Task) tasks.get(_i);
      Controller.inst().subtractassignment(taskx, _val); } }


  public void setdependsOn(List dependsOnxx) { dependsOn = dependsOnxx;
    }
 
  public void adddependsOn(Task dependsOnxx) { dependsOn.add(dependsOnxx);
    }
 
  public void removedependsOn(Task dependsOnxx) { Vector _removeddependsOndependsOnxx = new Vector();
  _removeddependsOndependsOnxx.add(dependsOnxx);
  dependsOn.removeAll(_removeddependsOndependsOnxx);
    }

  public static void setAlldependsOn(List tasks,List _val)
  { for (int _i = 0; _i < tasks.size(); _i++)
    { Task taskx = (Task) tasks.get(_i);
      Controller.inst().setdependsOn(taskx, _val); } }

  public static void addAlldependsOn(List tasks,Task _val)
  { for (int _i = 0; _i < tasks.size(); _i++)
    { Task taskx = (Task) tasks.get(_i);
      Controller.inst().adddependsOn(taskx, _val); } }


  public static void removeAlldependsOn(List tasks,Task _val)
  { for (int _i = 0; _i < tasks.size(); _i++)
    { Task taskx = (Task) tasks.get(_i);
      Controller.inst().removedependsOn(taskx, _val); } }


  public static void unionAlldependsOn(List tasks, List _val)
  { for (int _i = 0; _i < tasks.size(); _i++)
    { Task taskx = (Task) tasks.get(_i);
      Controller.inst().uniondependsOn(taskx, _val); } }


  public static void subtractAlldependsOn(List tasks, List _val)
  { for (int _i = 0; _i < tasks.size(); _i++)
    { Task taskx = (Task) tasks.get(_i);
      Controller.inst().subtractdependsOn(taskx, _val); } }


  public void setneeds(List needsxx) { needs = needsxx;
    }
 
  public void addneeds(Skill needsxx) { needs.add(needsxx);
    }
 
  public void removeneeds(Skill needsxx) { Vector _removedneedsneedsxx = new Vector();
  _removedneedsneedsxx.add(needsxx);
  needs.removeAll(_removedneedsneedsxx);
    }

  public static void setAllneeds(List tasks,List _val)
  { for (int _i = 0; _i < tasks.size(); _i++)
    { Task taskx = (Task) tasks.get(_i);
      Controller.inst().setneeds(taskx, _val); } }

  public static void addAllneeds(List tasks,Skill _val)
  { for (int _i = 0; _i < tasks.size(); _i++)
    { Task taskx = (Task) tasks.get(_i);
      Controller.inst().addneeds(taskx, _val); } }


  public static void removeAllneeds(List tasks,Skill _val)
  { for (int _i = 0; _i < tasks.size(); _i++)
    { Task taskx = (Task) tasks.get(_i);
      Controller.inst().removeneeds(taskx, _val); } }


  public static void unionAllneeds(List tasks, List _val)
  { for (int _i = 0; _i < tasks.size(); _i++)
    { Task taskx = (Task) tasks.get(_i);
      Controller.inst().unionneeds(taskx, _val); } }


  public static void subtractAllneeds(List tasks, List _val)
  { for (int _i = 0; _i < tasks.size(); _i++)
    { Task taskx = (Task) tasks.get(_i);
      Controller.inst().subtractneeds(taskx, _val); } }


    public String gettaskId() { return taskId; }

    public static List getAlltaskId(List tasks)
  { List result = new Vector();
    for (int i = 0; i < tasks.size(); i++)
    { Task taskx = (Task) tasks.get(i);
      if (result.contains(taskx.gettaskId())) { }
      else { result.add(taskx.gettaskId()); } }
    return result; }

    public static List getAllOrderedtaskId(List tasks)
  { List result = new Vector();
    for (int i = 0; i < tasks.size(); i++)
    { Task taskx = (Task) tasks.get(i);
      result.add(taskx.gettaskId()); } 
    return result; }

    public int getduration() { return duration; }

    public static List getAllduration(List tasks)
  { List result = new Vector();
    for (int i = 0; i < tasks.size(); i++)
    { Task taskx = (Task) tasks.get(i);
      if (result.contains(new Integer(taskx.getduration()))) { }
      else { result.add(new Integer(taskx.getduration())); } }
    return result; }

    public static List getAllOrderedduration(List tasks)
  { List result = new Vector();
    for (int i = 0; i < tasks.size(); i++)
    { Task taskx = (Task) tasks.get(i);
      result.add(new Integer(taskx.getduration())); } 
    return result; }

  public List getassignment() { return (Vector) ((Vector) assignment).clone(); }

  public static List getAllassignment(List tasks)
  { List result = new Vector();
    for (int _i = 0; _i < tasks.size(); _i++)
    { Task taskx = (Task) tasks.get(_i);
      result = Set.union(result,taskx.getassignment()); }
    return result; }

  public static List getAllOrderedassignment(List tasks)
  { List result = new Vector();
    for (int _i = 0; _i < tasks.size(); _i++)
    { Task taskx = (Task) tasks.get(_i);
      result = Set.union(result,taskx.getassignment()); }
    return result; }

  public List getdependsOn() { return (Vector) ((Vector) dependsOn).clone(); }

  public static List getAlldependsOn(List tasks)
  { List result = new Vector();
    for (int _i = 0; _i < tasks.size(); _i++)
    { Task taskx = (Task) tasks.get(_i);
      result = Set.union(result,taskx.getdependsOn()); }
    return result; }

  public static List getAllOrdereddependsOn(List tasks)
  { List result = new Vector();
    for (int _i = 0; _i < tasks.size(); _i++)
    { Task taskx = (Task) tasks.get(_i);
      result = Set.union(result,taskx.getdependsOn()); }
    return result; }

  public List getneeds() { return (Vector) ((Vector) needs).clone(); }

  public static List getAllneeds(List tasks)
  { List result = new Vector();
    for (int _i = 0; _i < tasks.size(); _i++)
    { Task taskx = (Task) tasks.get(_i);
      result = Set.union(result,taskx.getneeds()); }
    return result; }

  public static List getAllOrderedneeds(List tasks)
  { List result = new Vector();
    for (int _i = 0; _i < tasks.size(); _i++)
    { Task taskx = (Task) tasks.get(_i);
      result = Set.union(result,taskx.getneeds()); }
    return result; }

    public int totalDuration()
  {   int result = 0;
 
  if (dependsOn.size() == 0) 
  {   result = duration;
 
  }  else   if (dependsOn.size() > 0) 
  {   result = duration + ((Integer) Set.max(Set.collect_0(dependsOn))).intValue();
 
  }    return result;
  }



}


class Story
  implements SystemTypes
{
  private String storyId = ""; // internal
  private List subtasks = new Vector(); // of Task

  public Story()
  {
    this.storyId = "";

  }



  public String toString()
  { String _res_ = "(Story) ";
    _res_ = _res_ + storyId;
    return _res_;
  }

  public void setstoryId(String storyId_x) { storyId = storyId_x;  }


    public static void setAllstoryId(List storys,String val)
  { for (int i = 0; i < storys.size(); i++)
    { Story storyx = (Story) storys.get(i);
      Controller.inst().setstoryId(storyx,val); } }


  public void setsubtasks(List subtasksxx) { subtasks = subtasksxx;
    }
 
  public void setsubtasks(int ind_x,Task subtasksxx) { subtasks.set(ind_x,subtasksxx); }

 public void addsubtasks(Task subtasksxx) { subtasks.add(subtasksxx);
    }
 
  public void removesubtasks(Task subtasksxx) { Vector _removedsubtaskssubtasksxx = new Vector();
  _removedsubtaskssubtasksxx.add(subtasksxx);
  subtasks.removeAll(_removedsubtaskssubtasksxx);
    }

  public static void setAllsubtasks(List storys,List _val)
  { for (int _i = 0; _i < storys.size(); _i++)
    { Story storyx = (Story) storys.get(_i);
      Controller.inst().setsubtasks(storyx, _val); } }

  public static void setAllsubtasks(List storys,int _ind,Task _val)
  { for (int _i = 0; _i < storys.size(); _i++)
    { Story storyx = (Story) storys.get(_i);
      Controller.inst().setsubtasks(storyx,_ind,_val); } }

  public static void addAllsubtasks(List storys,Task _val)
  { for (int _i = 0; _i < storys.size(); _i++)
    { Story storyx = (Story) storys.get(_i);
      Controller.inst().addsubtasks(storyx, _val); } }


  public static void removeAllsubtasks(List storys,Task _val)
  { for (int _i = 0; _i < storys.size(); _i++)
    { Story storyx = (Story) storys.get(_i);
      Controller.inst().removesubtasks(storyx, _val); } }


  public static void unionAllsubtasks(List storys, List _val)
  { for (int _i = 0; _i < storys.size(); _i++)
    { Story storyx = (Story) storys.get(_i);
      Controller.inst().unionsubtasks(storyx, _val); } }


  public static void subtractAllsubtasks(List storys, List _val)
  { for (int _i = 0; _i < storys.size(); _i++)
    { Story storyx = (Story) storys.get(_i);
      Controller.inst().subtractsubtasks(storyx, _val); } }


    public String getstoryId() { return storyId; }

    public static List getAllstoryId(List storys)
  { List result = new Vector();
    for (int i = 0; i < storys.size(); i++)
    { Story storyx = (Story) storys.get(i);
      if (result.contains(storyx.getstoryId())) { }
      else { result.add(storyx.getstoryId()); } }
    return result; }

    public static List getAllOrderedstoryId(List storys)
  { List result = new Vector();
    for (int i = 0; i < storys.size(); i++)
    { Story storyx = (Story) storys.get(i);
      result.add(storyx.getstoryId()); } 
    return result; }

  public List getsubtasks() { return (Vector) ((Vector) subtasks).clone(); }

  public static List getAllsubtasks(List storys)
  { List result = new Vector();
    for (int _i = 0; _i < storys.size(); _i++)
    { Story storyx = (Story) storys.get(_i);
      result = Set.union(result,storyx.getsubtasks()); }
    return result; }

  public static List getAllOrderedsubtasks(List storys)
  { List result = new Vector();
    for (int _i = 0; _i < storys.size(); _i++)
    { Story storyx = (Story) storys.get(_i);
      result.addAll(storyx.getsubtasks()); }
    return result; }


}


class Skill
  implements SystemTypes
{
  private String skillId = ""; // internal

  public Skill()
  {
    this.skillId = "";

  }



  public String toString()
  { String _res_ = "(Skill) ";
    _res_ = _res_ + skillId;
    return _res_;
  }

  public void setskillId(String skillId_x) { skillId = skillId_x;  }


    public static void setAllskillId(List skills,String val)
  { for (int i = 0; i < skills.size(); i++)
    { Skill skillx = (Skill) skills.get(i);
      Controller.inst().setskillId(skillx,val); } }


    public String getskillId() { return skillId; }

    public static List getAllskillId(List skills)
  { List result = new Vector();
    for (int i = 0; i < skills.size(); i++)
    { Skill skillx = (Skill) skills.get(i);
      if (result.contains(skillx.getskillId())) { }
      else { result.add(skillx.getskillId()); } }
    return result; }

    public static List getAllOrderedskillId(List skills)
  { List result = new Vector();
    for (int i = 0; i < skills.size(); i++)
    { Skill skillx = (Skill) skills.get(i);
      result.add(skillx.getskillId()); } 
    return result; }


}


class Schedule
  implements SystemTypes
{
  private int totalCost = 0; // internal
  private int duration = 0; // internal
  private List assignment = new Vector(); // of Assignment
  private List sortedtasks = new Vector(); // of Task
  private List sortedstaff = new Vector(); // of Staff

  public Schedule()
  {
    this.totalCost = 0;
    this.duration = 0;

  }



  public String toString()
  { String _res_ = "(Schedule) ";
    _res_ = _res_ + totalCost + ",";
    _res_ = _res_ + duration;
    return _res_;
  }

  public void settotalCost(int totalCost_x) { totalCost = totalCost_x;  }


    public static void setAlltotalCost(List schedules,int val)
  { for (int i = 0; i < schedules.size(); i++)
    { Schedule schedulex = (Schedule) schedules.get(i);
      Controller.inst().settotalCost(schedulex,val); } }


  public void setduration(int duration_x) { duration = duration_x;  }


    public static void setAllduration(List schedules,int val)
  { for (int i = 0; i < schedules.size(); i++)
    { Schedule schedulex = (Schedule) schedules.get(i);
      Controller.inst().setduration(schedulex,val); } }


  public void setassignment(List assignmentxx) { assignment = assignmentxx;
    }
 
  public void setassignment(int ind_x,Assignment assignmentxx) { assignment.set(ind_x,assignmentxx); }

 public void addassignment(Assignment assignmentxx) { assignment.add(assignmentxx);
    }
 
  public void removeassignment(Assignment assignmentxx) { Vector _removedassignmentassignmentxx = new Vector();
  _removedassignmentassignmentxx.add(assignmentxx);
  assignment.removeAll(_removedassignmentassignmentxx);
    }

  public static void setAllassignment(List schedules,List _val)
  { for (int _i = 0; _i < schedules.size(); _i++)
    { Schedule schedulex = (Schedule) schedules.get(_i);
      Controller.inst().setassignment(schedulex, _val); } }

  public static void setAllassignment(List schedules,int _ind,Assignment _val)
  { for (int _i = 0; _i < schedules.size(); _i++)
    { Schedule schedulex = (Schedule) schedules.get(_i);
      Controller.inst().setassignment(schedulex,_ind,_val); } }

  public static void addAllassignment(List schedules,Assignment _val)
  { for (int _i = 0; _i < schedules.size(); _i++)
    { Schedule schedulex = (Schedule) schedules.get(_i);
      Controller.inst().addassignment(schedulex, _val); } }


  public static void removeAllassignment(List schedules,Assignment _val)
  { for (int _i = 0; _i < schedules.size(); _i++)
    { Schedule schedulex = (Schedule) schedules.get(_i);
      Controller.inst().removeassignment(schedulex, _val); } }


  public static void unionAllassignment(List schedules, List _val)
  { for (int _i = 0; _i < schedules.size(); _i++)
    { Schedule schedulex = (Schedule) schedules.get(_i);
      Controller.inst().unionassignment(schedulex, _val); } }


  public static void subtractAllassignment(List schedules, List _val)
  { for (int _i = 0; _i < schedules.size(); _i++)
    { Schedule schedulex = (Schedule) schedules.get(_i);
      Controller.inst().subtractassignment(schedulex, _val); } }


  public void setsortedtasks(List sortedtasksxx) { sortedtasks = sortedtasksxx;
    }
 
  public void setsortedtasks(int ind_x,Task sortedtasksxx) { sortedtasks.set(ind_x,sortedtasksxx); }

 public void addsortedtasks(Task sortedtasksxx) { sortedtasks.add(sortedtasksxx);
    }
 
  public void removesortedtasks(Task sortedtasksxx) { Vector _removedsortedtaskssortedtasksxx = new Vector();
  _removedsortedtaskssortedtasksxx.add(sortedtasksxx);
  sortedtasks.removeAll(_removedsortedtaskssortedtasksxx);
    }

  public static void setAllsortedtasks(List schedules,List _val)
  { for (int _i = 0; _i < schedules.size(); _i++)
    { Schedule schedulex = (Schedule) schedules.get(_i);
      Controller.inst().setsortedtasks(schedulex, _val); } }

  public static void setAllsortedtasks(List schedules,int _ind,Task _val)
  { for (int _i = 0; _i < schedules.size(); _i++)
    { Schedule schedulex = (Schedule) schedules.get(_i);
      Controller.inst().setsortedtasks(schedulex,_ind,_val); } }

  public static void addAllsortedtasks(List schedules,Task _val)
  { for (int _i = 0; _i < schedules.size(); _i++)
    { Schedule schedulex = (Schedule) schedules.get(_i);
      Controller.inst().addsortedtasks(schedulex, _val); } }


  public static void removeAllsortedtasks(List schedules,Task _val)
  { for (int _i = 0; _i < schedules.size(); _i++)
    { Schedule schedulex = (Schedule) schedules.get(_i);
      Controller.inst().removesortedtasks(schedulex, _val); } }


  public static void unionAllsortedtasks(List schedules, List _val)
  { for (int _i = 0; _i < schedules.size(); _i++)
    { Schedule schedulex = (Schedule) schedules.get(_i);
      Controller.inst().unionsortedtasks(schedulex, _val); } }


  public static void subtractAllsortedtasks(List schedules, List _val)
  { for (int _i = 0; _i < schedules.size(); _i++)
    { Schedule schedulex = (Schedule) schedules.get(_i);
      Controller.inst().subtractsortedtasks(schedulex, _val); } }


  public void setsortedstaff(List sortedstaffxx) { sortedstaff = sortedstaffxx;
    }
 
  public void setsortedstaff(int ind_x,Staff sortedstaffxx) { sortedstaff.set(ind_x,sortedstaffxx); }

 public void addsortedstaff(Staff sortedstaffxx) { sortedstaff.add(sortedstaffxx);
    }
 
  public void removesortedstaff(Staff sortedstaffxx) { Vector _removedsortedstaffsortedstaffxx = new Vector();
  _removedsortedstaffsortedstaffxx.add(sortedstaffxx);
  sortedstaff.removeAll(_removedsortedstaffsortedstaffxx);
    }

  public static void setAllsortedstaff(List schedules,List _val)
  { for (int _i = 0; _i < schedules.size(); _i++)
    { Schedule schedulex = (Schedule) schedules.get(_i);
      Controller.inst().setsortedstaff(schedulex, _val); } }

  public static void setAllsortedstaff(List schedules,int _ind,Staff _val)
  { for (int _i = 0; _i < schedules.size(); _i++)
    { Schedule schedulex = (Schedule) schedules.get(_i);
      Controller.inst().setsortedstaff(schedulex,_ind,_val); } }

  public static void addAllsortedstaff(List schedules,Staff _val)
  { for (int _i = 0; _i < schedules.size(); _i++)
    { Schedule schedulex = (Schedule) schedules.get(_i);
      Controller.inst().addsortedstaff(schedulex, _val); } }


  public static void removeAllsortedstaff(List schedules,Staff _val)
  { for (int _i = 0; _i < schedules.size(); _i++)
    { Schedule schedulex = (Schedule) schedules.get(_i);
      Controller.inst().removesortedstaff(schedulex, _val); } }


  public static void unionAllsortedstaff(List schedules, List _val)
  { for (int _i = 0; _i < schedules.size(); _i++)
    { Schedule schedulex = (Schedule) schedules.get(_i);
      Controller.inst().unionsortedstaff(schedulex, _val); } }


  public static void subtractAllsortedstaff(List schedules, List _val)
  { for (int _i = 0; _i < schedules.size(); _i++)
    { Schedule schedulex = (Schedule) schedules.get(_i);
      Controller.inst().subtractsortedstaff(schedulex, _val); } }


    public int gettotalCost() { return totalCost; }

    public static List getAlltotalCost(List schedules)
  { List result = new Vector();
    for (int i = 0; i < schedules.size(); i++)
    { Schedule schedulex = (Schedule) schedules.get(i);
      if (result.contains(new Integer(schedulex.gettotalCost()))) { }
      else { result.add(new Integer(schedulex.gettotalCost())); } }
    return result; }

    public static List getAllOrderedtotalCost(List schedules)
  { List result = new Vector();
    for (int i = 0; i < schedules.size(); i++)
    { Schedule schedulex = (Schedule) schedules.get(i);
      result.add(new Integer(schedulex.gettotalCost())); } 
    return result; }

    public int getduration() { return duration; }

    public static List getAllduration(List schedules)
  { List result = new Vector();
    for (int i = 0; i < schedules.size(); i++)
    { Schedule schedulex = (Schedule) schedules.get(i);
      if (result.contains(new Integer(schedulex.getduration()))) { }
      else { result.add(new Integer(schedulex.getduration())); } }
    return result; }

    public static List getAllOrderedduration(List schedules)
  { List result = new Vector();
    for (int i = 0; i < schedules.size(); i++)
    { Schedule schedulex = (Schedule) schedules.get(i);
      result.add(new Integer(schedulex.getduration())); } 
    return result; }

  public List getassignment() { return (Vector) ((Vector) assignment).clone(); }

  public static List getAllassignment(List schedules)
  { List result = new Vector();
    for (int _i = 0; _i < schedules.size(); _i++)
    { Schedule schedulex = (Schedule) schedules.get(_i);
      result = Set.union(result,schedulex.getassignment()); }
    return result; }

  public static List getAllOrderedassignment(List schedules)
  { List result = new Vector();
    for (int _i = 0; _i < schedules.size(); _i++)
    { Schedule schedulex = (Schedule) schedules.get(_i);
      result.addAll(schedulex.getassignment()); }
    return result; }

  public List getsortedtasks() { return (Vector) ((Vector) sortedtasks).clone(); }

  public static List getAllsortedtasks(List schedules)
  { List result = new Vector();
    for (int _i = 0; _i < schedules.size(); _i++)
    { Schedule schedulex = (Schedule) schedules.get(_i);
      result = Set.union(result,schedulex.getsortedtasks()); }
    return result; }

  public static List getAllOrderedsortedtasks(List schedules)
  { List result = new Vector();
    for (int _i = 0; _i < schedules.size(); _i++)
    { Schedule schedulex = (Schedule) schedules.get(_i);
      result.addAll(schedulex.getsortedtasks()); }
    return result; }

  public List getsortedstaff() { return (Vector) ((Vector) sortedstaff).clone(); }

  public static List getAllsortedstaff(List schedules)
  { List result = new Vector();
    for (int _i = 0; _i < schedules.size(); _i++)
    { Schedule schedulex = (Schedule) schedules.get(_i);
      result = Set.union(result,schedulex.getsortedstaff()); }
    return result; }

  public static List getAllOrderedsortedstaff(List schedules)
  { List result = new Vector();
    for (int _i = 0; _i < schedules.size(); _i++)
    { Schedule schedulex = (Schedule) schedules.get(_i);
      result.addAll(schedulex.getsortedstaff()); }
    return result; }

    public void allocatestaff1(Task t,Staff st)
  {   //  if ((!(t.getassignment().size() == 0 && st.getassigned().size() == 0) || !(st.gethas().containsAll(t.getneeds()))))) { return; } 
  Assignment a = new Assignment();
    Controller.inst().addAssignment(a);
    Controller.inst().settask(a,t);
    Controller.inst().setstaff(a,st);
    Controller.inst().addassignment(this,a);
  }

    public boolean allocatestaff1test(Task t,Staff st)
  {  boolean result;
Schedule schedulex = this;
     if (t.getassignment().size() == 0 && st.getassigned().size() == 0 && st.gethas().containsAll(t.getneeds())) {   return true; }

    return false;

  }


    public static boolean allocatestaff1search()
  {  boolean result;
  List _range1 = Controller.inst().schedules;
  for (int _i0 = 0; _i0 < _range1.size(); _i0++)
  { Schedule schedulex = (Schedule) _range1.get(_i0);
      List _range3 = schedulex.getsortedtasks();
  for (int _i2 = 0; _i2 < _range3.size(); _i2++)
  { Task t = (Task) _range3.get(_i2);
      List _range5 = schedulex.getsortedstaff();
  for (int _i4 = 0; _i4 < _range5.size(); _i4++)
  { Staff st = (Staff) _range5.get(_i4);
       if (schedulex.allocatestaff1test(t,st)) {    Controller.inst().allocatestaff1(schedulex,t,st);
    return true;
 }

  }
  }
  }
    return false;

  }


    public void calculatecost1()
  { Controller.inst().settotalCost(this,Set.sumint(Set.collect_1(this.getassignment())));
  }

    public void initialisation1()
  { Controller.inst().setsortedstaff(this,Set.sortedBy(Controller.inst().staffs, Set.collect_2(Controller.inst().staffs)));
    Controller.inst().setsortedtasks(this,Set.sortedBy(Controller.inst().tasks, Set.collect_3(Controller.inst().tasks)));
  }


}


class AllocateStaff
  implements SystemTypes
{

  public AllocateStaff()
  {

  }



  public String toString()
  { String _res_ = "(AllocateStaff) ";
    return _res_;
  }


}


class DisplaySchedule
  implements SystemTypes
{

  public DisplaySchedule()
  {

  }



  public String toString()
  { String _res_ = "(DisplaySchedule) ";
    return _res_;
  }


}


class CalculateCost
  implements SystemTypes
{

  public CalculateCost()
  {

  }



  public String toString()
  { String _res_ = "(CalculateCost) ";
    return _res_;
  }


}


class Initialisation
  implements SystemTypes
{

  public Initialisation()
  {

  }



  public String toString()
  { String _res_ = "(Initialisation) ";
    return _res_;
  }


}


class ClearTasks
  implements SystemTypes
{

  public ClearTasks()
  {

  }



  public String toString()
  { String _res_ = "(ClearTasks) ";
    return _res_;
  }


}



public class Controller implements SystemTypes, ControllerInterface
{
  Vector staffs = new Vector();
  Map staffstaffIdindex = new HashMap(); // String --> Staff

  Vector assignments = new Vector();
  Vector tasks = new Vector();
  Map tasktaskIdindex = new HashMap(); // String --> Task

  Vector storys = new Vector();
  Map storystoryIdindex = new HashMap(); // String --> Story

  Vector skills = new Vector();
  Map skillskillIdindex = new HashMap(); // String --> Skill

  Vector schedules = new Vector();
  Vector allocatestaffs = new Vector();
  Vector displayschedules = new Vector();
  Vector calculatecosts = new Vector();
  Vector initialisations = new Vector();
  Vector cleartaskss = new Vector();
  private static Controller uniqueInstance; 


  private Controller() { } 


  public static Controller inst() 
    { if (uniqueInstance == null) 
    { uniqueInstance = new Controller(); }
    return uniqueInstance; } 


  public static void loadModel(String file)
  {
    try
    { BufferedReader br = null;
      File f = new File(file);
      try 
      { br = new BufferedReader(new FileReader(f)); }
      catch (Exception ex) 
      { System.err.println("No file: " + file); return; }
      Class cont = Class.forName("Controller");
      java.util.Map objectmap = new java.util.HashMap();
      while (true)
      { String line1;
        try { line1 = br.readLine(); }
        catch (Exception e)
        { return; }
        if (line1 == null)
        { return; }
        line1 = line1.trim();

        if (line1.length() == 0) { continue; }
        String left;
        String op;
        String right;
        if (line1.charAt(line1.length() - 1) == '"')
        { int eqind = line1.indexOf("="); 
          if (eqind == -1) { continue; }
          else 
          { left = line1.substring(0,eqind-1).trim();
            op = "="; 
            right = line1.substring(eqind+1,line1.length()).trim();
          }
        }
        else
        { StringTokenizer st1 = new StringTokenizer(line1);
          Vector vals1 = new Vector();
          while (st1.hasMoreTokens())
          { String val1 = st1.nextToken();
            vals1.add(val1);
          }
          if (vals1.size() < 3)
          { continue; }
          left = (String) vals1.get(0);
          op = (String) vals1.get(1);
          right = (String) vals1.get(2);
        }
        if (":".equals(op))
        { int i2 = right.indexOf(".");
          if (i2 == -1)
          { Class cl;
            try { cl = Class.forName("" + right); }
            catch (Exception _x) { System.err.println("No entity: " + right); continue; }
            Object xinst = cl.newInstance();
            objectmap.put(left,xinst);
            Class[] cargs = new Class[] { cl };
            Method addC = cont.getMethod("add" + right,cargs);
            if (addC == null) { continue; }
            Object[] args = new Object[] { xinst };
            addC.invoke(Controller.inst(),args);
          }
          else
          { String obj = right.substring(0,i2);
            String role = right.substring(i2+1,right.length());
            Object objinst = objectmap.get(obj); 
            if (objinst == null) 
            { continue; }
            Object val = objectmap.get(left);
            if (val == null) 
            { continue; }
            Class objC = objinst.getClass();
            Class typeclass = val.getClass(); 
            Object[] args = new Object[] { val }; 
            Class[] settypes = new Class[] { typeclass };
            Method addrole = Controller.findMethod(objC,"add" + role);
            if (addrole != null) 
            { addrole.invoke(objinst, args); }
            else { System.err.println("Error: cannot add to " + role); }
          }
        }
        else if ("=".equals(op))
        { int i1 = left.indexOf(".");
          if (i1 == -1) 
          { continue; }
          String obj = left.substring(0,i1);
          String att = left.substring(i1+1,left.length());
          Object objinst = objectmap.get(obj); 
          if (objinst == null) 
          { continue; }
          Class objC = objinst.getClass();
          Class typeclass; 
          Object val; 
          if (right.charAt(0) == '"' &&
              right.charAt(right.length() - 1) == '"')
          { typeclass = String.class;
            val = right.substring(1,right.length() - 1);
          } 
          else if ("true".equals(right) || "false".equals(right))
          { typeclass = boolean.class;
            if ("true".equals(right))
            { val = new Boolean(true); }
            else
            { val = new Boolean(false); }
          }
          else 
          { val = objectmap.get(right);
            if (val != null)
            { typeclass = val.getClass(); }
            else 
            { int i;
              long l; 
              double d;
              try 
              { i = Integer.parseInt(right);
                typeclass = int.class;
                val = new Integer(i); 
              }
              catch (Exception ee)
              { try 
                { l = Long.parseLong(right);
                  typeclass = long.class;
                  val = new Long(l); 
                }
                catch (Exception eee)
                { try
                  { d = Double.parseDouble(right);
                    typeclass = double.class;
                    val = new Double(d);
                  }
                  catch (Exception ff)
                  { continue; }
                }
              }
            }
          }
          Object[] args = new Object[] { val }; 
          Class[] settypes = new Class[] { typeclass };
          Method setatt = Controller.findMethod(objC,"set" + att);
          if (setatt != null) 
          { setatt.invoke(objinst, args); }
          else { System.err.println("No attribute: " + att); }
        }
      }
    } catch (Exception e) { }
  }

  public static Method findMethod(Class c, String name)
  { Method[] mets = c.getMethods(); 
    for (int i = 0; i < mets.length; i++)
    { Method m = mets[i];
      if (m.getName().equals(name))
      { return m; }
    } 
    return null;
  }


  public void checkCompleteness()
  {   for (int _i = 0; _i < staffs.size(); _i++)
  { Staff staff_x = (Staff) staffs.get(_i);
    Staff staff_obj = (Staff) staffstaffIdindex.get(staff_x.getstaffId());
    if (staff_obj == staff_x) { }
    else if (staff_obj == null)
    { staffstaffIdindex.put(staff_x.getstaffId(),staff_x); }
    else
    { System.out.println("Error: multiple objects with id1 = " + staff_x.getstaffId()); }
  }
  for (int _i = 0; _i < tasks.size(); _i++)
  { Task task_x = (Task) tasks.get(_i);
    Task task_obj = (Task) tasktaskIdindex.get(task_x.gettaskId());
    if (task_obj == task_x) { }
    else if (task_obj == null)
    { tasktaskIdindex.put(task_x.gettaskId(),task_x); }
    else
    { System.out.println("Error: multiple objects with id1 = " + task_x.gettaskId()); }
  }
  for (int _i = 0; _i < storys.size(); _i++)
  { Story story_x = (Story) storys.get(_i);
    Story story_obj = (Story) storystoryIdindex.get(story_x.getstoryId());
    if (story_obj == story_x) { }
    else if (story_obj == null)
    { storystoryIdindex.put(story_x.getstoryId(),story_x); }
    else
    { System.out.println("Error: multiple objects with id1 = " + story_x.getstoryId()); }
  }
  for (int _i = 0; _i < skills.size(); _i++)
  { Skill skill_x = (Skill) skills.get(_i);
    Skill skill_obj = (Skill) skillskillIdindex.get(skill_x.getskillId());
    if (skill_obj == skill_x) { }
    else if (skill_obj == null)
    { skillskillIdindex.put(skill_x.getskillId(),skill_x); }
    else
    { System.out.println("Error: multiple objects with id1 = " + skill_x.getskillId()); }
  }
  for (int _i = 0; _i < assignments.size(); _i++)
  { Assignment assigned_assignmentx1 = (Assignment) assignments.get(_i);
    for (int _j = 0; _j < staffs.size(); _j++)
    { Staff staff_staffx2 = (Staff) staffs.get(_j);
      if (assigned_assignmentx1.getstaff() == staff_staffx2)
      { if (staff_staffx2.getassigned().contains(assigned_assignmentx1)) { }
        else { staff_staffx2.addassigned(assigned_assignmentx1); }
      }
      else if (staff_staffx2.getassigned().contains(assigned_assignmentx1))
      { assigned_assignmentx1.setstaff(staff_staffx2); } 
    }
  }
  for (int _i = 0; _i < assignments.size(); _i++)
  { Assignment assignment_assignmentx1 = (Assignment) assignments.get(_i);
    for (int _j = 0; _j < tasks.size(); _j++)
    { Task task_taskx2 = (Task) tasks.get(_j);
      if (assignment_assignmentx1.gettask() == task_taskx2)
      { if (task_taskx2.getassignment().contains(assignment_assignmentx1)) { }
        else { task_taskx2.addassignment(assignment_assignmentx1); }
      }
      else if (task_taskx2.getassignment().contains(assignment_assignmentx1))
      { assignment_assignmentx1.settask(task_taskx2); } 
    }
  }
  }


  public void saveModel(String file)
  { File outfile = new File(file); 
    PrintWriter out; 
    try { out = new PrintWriter(new BufferedWriter(new FileWriter(outfile))); }
    catch (Exception e) { return; } 
  for (int _i = 0; _i < staffs.size(); _i++)
  { Staff staffx_ = (Staff) staffs.get(_i);
    out.println("staffx_" + _i + " : Staff");
    out.println("staffx_" + _i + ".staffId = \"" + staffx_.getstaffId() + "\"");
    out.println("staffx_" + _i + ".costDay = " + staffx_.getcostDay());
  }

  for (int _i = 0; _i < assignments.size(); _i++)
  { Assignment assignmentx_ = (Assignment) assignments.get(_i);
    out.println("assignmentx_" + _i + " : Assignment");
  }

  for (int _i = 0; _i < tasks.size(); _i++)
  { Task taskx_ = (Task) tasks.get(_i);
    out.println("taskx_" + _i + " : Task");
    out.println("taskx_" + _i + ".taskId = \"" + taskx_.gettaskId() + "\"");
    out.println("taskx_" + _i + ".duration = " + taskx_.getduration());
  }

  for (int _i = 0; _i < storys.size(); _i++)
  { Story storyx_ = (Story) storys.get(_i);
    out.println("storyx_" + _i + " : Story");
    out.println("storyx_" + _i + ".storyId = \"" + storyx_.getstoryId() + "\"");
  }

  for (int _i = 0; _i < skills.size(); _i++)
  { Skill skillx_ = (Skill) skills.get(_i);
    out.println("skillx_" + _i + " : Skill");
    out.println("skillx_" + _i + ".skillId = \"" + skillx_.getskillId() + "\"");
  }

  for (int _i = 0; _i < schedules.size(); _i++)
  { Schedule schedulex_ = (Schedule) schedules.get(_i);
    out.println("schedulex_" + _i + " : Schedule");
    out.println("schedulex_" + _i + ".totalCost = " + schedulex_.gettotalCost());
    out.println("schedulex_" + _i + ".duration = " + schedulex_.getduration());
  }

  for (int _i = 0; _i < allocatestaffs.size(); _i++)
  { AllocateStaff allocatestaffx_ = (AllocateStaff) allocatestaffs.get(_i);
    out.println("allocatestaffx_" + _i + " : AllocateStaff");
  }

  for (int _i = 0; _i < displayschedules.size(); _i++)
  { DisplaySchedule displayschedulex_ = (DisplaySchedule) displayschedules.get(_i);
    out.println("displayschedulex_" + _i + " : DisplaySchedule");
  }

  for (int _i = 0; _i < calculatecosts.size(); _i++)
  { CalculateCost calculatecostx_ = (CalculateCost) calculatecosts.get(_i);
    out.println("calculatecostx_" + _i + " : CalculateCost");
  }

  for (int _i = 0; _i < initialisations.size(); _i++)
  { Initialisation initialisationx_ = (Initialisation) initialisations.get(_i);
    out.println("initialisationx_" + _i + " : Initialisation");
  }

  for (int _i = 0; _i < cleartaskss.size(); _i++)
  { ClearTasks cleartasksx_ = (ClearTasks) cleartaskss.get(_i);
    out.println("cleartasksx_" + _i + " : ClearTasks");
  }

  for (int _i = 0; _i < staffs.size(); _i++)
  { Staff staffx_ = (Staff) staffs.get(_i);
    List staff_assigned_Assignment = staffx_.getassigned();
    for (int _j = 0; _j < staff_assigned_Assignment.size(); _j++)
    { out.println("assignmentx_" + assignments.indexOf(staff_assigned_Assignment.get(_j)) + " : staffx_" + _i + ".assigned");
    }
    List staff_has_Skill = staffx_.gethas();
    for (int _j = 0; _j < staff_has_Skill.size(); _j++)
    { out.println("skillx_" + skills.indexOf(staff_has_Skill.get(_j)) + " : staffx_" + _i + ".has");
    }
  }
  for (int _i = 0; _i < assignments.size(); _i++)
  { Assignment assignmentx_ = (Assignment) assignments.get(_i);
    out.println("assignmentx_" + _i + ".staff = staffx_" + staffs.indexOf(((Assignment) assignments.get(_i)).getstaff()));
    out.println("assignmentx_" + _i + ".task = taskx_" + tasks.indexOf(((Assignment) assignments.get(_i)).gettask()));
  }
  for (int _i = 0; _i < tasks.size(); _i++)
  { Task taskx_ = (Task) tasks.get(_i);
    List task_assignment_Assignment = taskx_.getassignment();
    for (int _j = 0; _j < task_assignment_Assignment.size(); _j++)
    { out.println("assignmentx_" + assignments.indexOf(task_assignment_Assignment.get(_j)) + " : taskx_" + _i + ".assignment");
    }
    List task_dependsOn_Task = taskx_.getdependsOn();
    for (int _j = 0; _j < task_dependsOn_Task.size(); _j++)
    { out.println("taskx_" + tasks.indexOf(task_dependsOn_Task.get(_j)) + " : taskx_" + _i + ".dependsOn");
    }
    List task_needs_Skill = taskx_.getneeds();
    for (int _j = 0; _j < task_needs_Skill.size(); _j++)
    { out.println("skillx_" + skills.indexOf(task_needs_Skill.get(_j)) + " : taskx_" + _i + ".needs");
    }
  }
  for (int _i = 0; _i < storys.size(); _i++)
  { Story storyx_ = (Story) storys.get(_i);
    List story_subtasks_Task = storyx_.getsubtasks();
    for (int _j = 0; _j < story_subtasks_Task.size(); _j++)
    { out.println("taskx_" + tasks.indexOf(story_subtasks_Task.get(_j)) + " : storyx_" + _i + ".subtasks");
    }
  }
  for (int _i = 0; _i < schedules.size(); _i++)
  { Schedule schedulex_ = (Schedule) schedules.get(_i);
    List schedule_assignment_Assignment = schedulex_.getassignment();
    for (int _j = 0; _j < schedule_assignment_Assignment.size(); _j++)
    { out.println("assignmentx_" + assignments.indexOf(schedule_assignment_Assignment.get(_j)) + " : schedulex_" + _i + ".assignment");
    }
    List schedule_sortedtasks_Task = schedulex_.getsortedtasks();
    for (int _j = 0; _j < schedule_sortedtasks_Task.size(); _j++)
    { out.println("taskx_" + tasks.indexOf(schedule_sortedtasks_Task.get(_j)) + " : schedulex_" + _i + ".sortedtasks");
    }
    List schedule_sortedstaff_Staff = schedulex_.getsortedstaff();
    for (int _j = 0; _j < schedule_sortedstaff_Staff.size(); _j++)
    { out.println("staffx_" + staffs.indexOf(schedule_sortedstaff_Staff.get(_j)) + " : schedulex_" + _i + ".sortedstaff");
    }
  }
    out.close(); 
  }


  public void saveXSI(String file)
  { File outfile = new File(file); 
    PrintWriter out; 
    try { out = new PrintWriter(new BufferedWriter(new FileWriter(outfile))); }
    catch (Exception e) { return; } 
    out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    out.println("<My:model xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\">");
    for (int _i = 0; _i < staffs.size(); _i++)
    { Staff staffx_ = (Staff) staffs.get(_i);
       out.print("<staffs xsi:type=\"My:Staff\"");
    out.print(" staffId=\"" + staffx_.getstaffId() + "\" ");
    out.print(" costDay=\"" + staffx_.getcostDay() + "\" ");
    out.print(" assigned = \"");
    List staff_assigned = staffx_.getassigned();
    for (int _j = 0; _j < staff_assigned.size(); _j++)
    { out.print(" //@assignments." + assignments.indexOf(staff_assigned.get(_j)));
    }
    out.print("\"");
    out.print(" has = \"");
    List staff_has = staffx_.gethas();
    for (int _j = 0; _j < staff_has.size(); _j++)
    { out.print(" //@skills." + skills.indexOf(staff_has.get(_j)));
    }
    out.print("\"");
    out.println(" />");
  }

    for (int _i = 0; _i < assignments.size(); _i++)
    { Assignment assignmentx_ = (Assignment) assignments.get(_i);
       out.print("<assignments xsi:type=\"My:Assignment\"");
    out.print(" staff=\"");
    out.print("//@staffs." + staffs.indexOf(((Assignment) assignments.get(_i)).getstaff()));
    out.print("\"");
    out.print(" task=\"");
    out.print("//@tasks." + tasks.indexOf(((Assignment) assignments.get(_i)).gettask()));
    out.print("\"");
    out.println(" />");
  }

    for (int _i = 0; _i < tasks.size(); _i++)
    { Task taskx_ = (Task) tasks.get(_i);
       out.print("<tasks xsi:type=\"My:Task\"");
    out.print(" taskId=\"" + taskx_.gettaskId() + "\" ");
    out.print(" duration=\"" + taskx_.getduration() + "\" ");
    out.print(" assignment = \"");
    List task_assignment = taskx_.getassignment();
    for (int _j = 0; _j < task_assignment.size(); _j++)
    { out.print(" //@assignments." + assignments.indexOf(task_assignment.get(_j)));
    }
    out.print("\"");
    out.print(" dependsOn = \"");
    List task_dependsOn = taskx_.getdependsOn();
    for (int _j = 0; _j < task_dependsOn.size(); _j++)
    { out.print(" //@tasks." + tasks.indexOf(task_dependsOn.get(_j)));
    }
    out.print("\"");
    out.print(" needs = \"");
    List task_needs = taskx_.getneeds();
    for (int _j = 0; _j < task_needs.size(); _j++)
    { out.print(" //@skills." + skills.indexOf(task_needs.get(_j)));
    }
    out.print("\"");
    out.println(" />");
  }

    for (int _i = 0; _i < storys.size(); _i++)
    { Story storyx_ = (Story) storys.get(_i);
       out.print("<storys xsi:type=\"My:Story\"");
    out.print(" storyId=\"" + storyx_.getstoryId() + "\" ");
    out.print(" subtasks = \"");
    List story_subtasks = storyx_.getsubtasks();
    for (int _j = 0; _j < story_subtasks.size(); _j++)
    { out.print(" //@tasks." + tasks.indexOf(story_subtasks.get(_j)));
    }
    out.print("\"");
    out.println(" />");
  }

    for (int _i = 0; _i < skills.size(); _i++)
    { Skill skillx_ = (Skill) skills.get(_i);
       out.print("<skills xsi:type=\"My:Skill\"");
    out.print(" skillId=\"" + skillx_.getskillId() + "\" ");
    out.println(" />");
  }

    for (int _i = 0; _i < schedules.size(); _i++)
    { Schedule schedulex_ = (Schedule) schedules.get(_i);
       out.print("<schedules xsi:type=\"My:Schedule\"");
    out.print(" totalCost=\"" + schedulex_.gettotalCost() + "\" ");
    out.print(" duration=\"" + schedulex_.getduration() + "\" ");
    out.print(" assignment = \"");
    List schedule_assignment = schedulex_.getassignment();
    for (int _j = 0; _j < schedule_assignment.size(); _j++)
    { out.print(" //@assignments." + assignments.indexOf(schedule_assignment.get(_j)));
    }
    out.print("\"");
    out.print(" sortedtasks = \"");
    List schedule_sortedtasks = schedulex_.getsortedtasks();
    for (int _j = 0; _j < schedule_sortedtasks.size(); _j++)
    { out.print(" //@tasks." + tasks.indexOf(schedule_sortedtasks.get(_j)));
    }
    out.print("\"");
    out.print(" sortedstaff = \"");
    List schedule_sortedstaff = schedulex_.getsortedstaff();
    for (int _j = 0; _j < schedule_sortedstaff.size(); _j++)
    { out.print(" //@staffs." + staffs.indexOf(schedule_sortedstaff.get(_j)));
    }
    out.print("\"");
    out.println(" />");
  }

    for (int _i = 0; _i < allocatestaffs.size(); _i++)
    { AllocateStaff allocatestaffx_ = (AllocateStaff) allocatestaffs.get(_i);
       out.print("<allocatestaffs xsi:type=\"My:AllocateStaff\"");
    out.println(" />");
  }

    for (int _i = 0; _i < displayschedules.size(); _i++)
    { DisplaySchedule displayschedulex_ = (DisplaySchedule) displayschedules.get(_i);
       out.print("<displayschedules xsi:type=\"My:DisplaySchedule\"");
    out.println(" />");
  }

    for (int _i = 0; _i < calculatecosts.size(); _i++)
    { CalculateCost calculatecostx_ = (CalculateCost) calculatecosts.get(_i);
       out.print("<calculatecosts xsi:type=\"My:CalculateCost\"");
    out.println(" />");
  }

    for (int _i = 0; _i < initialisations.size(); _i++)
    { Initialisation initialisationx_ = (Initialisation) initialisations.get(_i);
       out.print("<initialisations xsi:type=\"My:Initialisation\"");
    out.println(" />");
  }

    for (int _i = 0; _i < cleartaskss.size(); _i++)
    { ClearTasks cleartasksx_ = (ClearTasks) cleartaskss.get(_i);
       out.print("<cleartaskss xsi:type=\"My:ClearTasks\"");
    out.println(" />");
  }

    out.println("</My:model>");
    out.close(); 
  }



  public void addStaff(Staff oo) { staffs.add(oo); }

  public Staff getStaffByPK(String staffIdx)
  {  return (Staff) staffstaffIdindex.get(staffIdx); }

  public List getStaffByPK(List staffIdx)
  { Vector res = new Vector(); 
    for (int _i = 0; _i < staffIdx.size(); _i++)
    { Staff staffx = getStaffByPK((String) staffIdx.get(_i));
      if (staffx != null) { res.add(staffx); }
    }
    return res; 
  }

  public void addAssignment(Assignment oo) { assignments.add(oo); }

  public void addTask(Task oo) { tasks.add(oo); }

  public Task getTaskByPK(String taskIdx)
  {  return (Task) tasktaskIdindex.get(taskIdx); }

  public List getTaskByPK(List taskIdx)
  { Vector res = new Vector(); 
    for (int _i = 0; _i < taskIdx.size(); _i++)
    { Task taskx = getTaskByPK((String) taskIdx.get(_i));
      if (taskx != null) { res.add(taskx); }
    }
    return res; 
  }

  public void addStory(Story oo) { storys.add(oo); }

  public Story getStoryByPK(String storyIdx)
  {  return (Story) storystoryIdindex.get(storyIdx); }

  public List getStoryByPK(List storyIdx)
  { Vector res = new Vector(); 
    for (int _i = 0; _i < storyIdx.size(); _i++)
    { Story storyx = getStoryByPK((String) storyIdx.get(_i));
      if (storyx != null) { res.add(storyx); }
    }
    return res; 
  }

  public void addSkill(Skill oo) { skills.add(oo); }

  public Skill getSkillByPK(String skillIdx)
  {  return (Skill) skillskillIdindex.get(skillIdx); }

  public List getSkillByPK(List skillIdx)
  { Vector res = new Vector(); 
    for (int _i = 0; _i < skillIdx.size(); _i++)
    { Skill skillx = getSkillByPK((String) skillIdx.get(_i));
      if (skillx != null) { res.add(skillx); }
    }
    return res; 
  }

  public void addSchedule(Schedule oo) { schedules.add(oo); }

  public void addAllocateStaff(AllocateStaff oo) { allocatestaffs.add(oo); }

  public void addDisplaySchedule(DisplaySchedule oo) { displayschedules.add(oo); }

  public void addCalculateCost(CalculateCost oo) { calculatecosts.add(oo); }

  public void addInitialisation(Initialisation oo) { initialisations.add(oo); }

  public void addClearTasks(ClearTasks oo) { cleartaskss.add(oo); }



  public void createAllStaff(List staffx)
  { for (int i = 0; i < staffx.size(); i++)
    { Staff staffx_x = (Staff) staffx.get(i);
      if (staffx_x == null) { staffx_x = new Staff(); }
      staffx.set(i,staffx_x);
      addStaff(staffx_x);
    }
  }


  public Staff createStaff(String staffIdx)
  { 
    if (staffstaffIdindex.get(staffIdx) != null) { return null; }
    Staff staffx = new Staff();
    addStaff(staffx);
    setstaffId(staffx,staffIdx);
    setcostDay(staffx,0);
    setassigned(staffx,new Vector());
    sethas(staffx,new Vector());
    staffstaffIdindex.put(staffIdx,staffx);

    return staffx;
  }

  public void createAllAssignment(List assignmentx)
  { for (int i = 0; i < assignmentx.size(); i++)
    { Assignment assignmentx_x = (Assignment) assignmentx.get(i);
      if (assignmentx_x == null) { assignmentx_x = new Assignment(); }
      assignmentx.set(i,assignmentx_x);
      addAssignment(assignmentx_x);
    }
  }


  public Assignment createAssignment(Staff staffx,Task taskx)
  { 
    Assignment assignmentx = new Assignment(staffx,taskx);
    addAssignment(assignmentx);
    setstaff(assignmentx,staffx);
    settask(assignmentx,taskx);

    return assignmentx;
  }

  public void createAllTask(List taskx)
  { for (int i = 0; i < taskx.size(); i++)
    { Task taskx_x = (Task) taskx.get(i);
      if (taskx_x == null) { taskx_x = new Task(); }
      taskx.set(i,taskx_x);
      addTask(taskx_x);
    }
  }


  public Task createTask(String taskIdx)
  { 
    if (tasktaskIdindex.get(taskIdx) != null) { return null; }
    Task taskx = new Task();
    addTask(taskx);
    settaskId(taskx,taskIdx);
    setduration(taskx,0);
    setassignment(taskx,new Vector());
    setdependsOn(taskx,new Vector());
    setneeds(taskx,new Vector());
    tasktaskIdindex.put(taskIdx,taskx);

    return taskx;
  }

  public void createAllStory(List storyx)
  { for (int i = 0; i < storyx.size(); i++)
    { Story storyx_x = (Story) storyx.get(i);
      if (storyx_x == null) { storyx_x = new Story(); }
      storyx.set(i,storyx_x);
      addStory(storyx_x);
    }
  }


  public Story createStory(String storyIdx)
  { 
    if (storystoryIdindex.get(storyIdx) != null) { return null; }
    Story storyx = new Story();
    addStory(storyx);
    setstoryId(storyx,storyIdx);
    setsubtasks(storyx,new Vector());
    storystoryIdindex.put(storyIdx,storyx);

    return storyx;
  }

  public void createAllSkill(List skillx)
  { for (int i = 0; i < skillx.size(); i++)
    { Skill skillx_x = (Skill) skillx.get(i);
      if (skillx_x == null) { skillx_x = new Skill(); }
      skillx.set(i,skillx_x);
      addSkill(skillx_x);
    }
  }


  public Skill createSkill(String skillIdx)
  { 
    if (skillskillIdindex.get(skillIdx) != null) { return null; }
    Skill skillx = new Skill();
    addSkill(skillx);
    setskillId(skillx,skillIdx);
    skillskillIdindex.put(skillIdx,skillx);

    return skillx;
  }

  public void createAllSchedule(List schedulex)
  { for (int i = 0; i < schedulex.size(); i++)
    { Schedule schedulex_x = (Schedule) schedulex.get(i);
      if (schedulex_x == null) { schedulex_x = new Schedule(); }
      schedulex.set(i,schedulex_x);
      addSchedule(schedulex_x);
    }
  }


  public Schedule createSchedule()
  { 
    Schedule schedulex = new Schedule();
    addSchedule(schedulex);
    settotalCost(schedulex,0);
    setduration(schedulex,0);
    setassignment(schedulex,new Vector());
    setsortedtasks(schedulex,new Vector());
    setsortedstaff(schedulex,new Vector());

    return schedulex;
  }

  public void createAllAllocateStaff(List allocatestaffx)
  { for (int i = 0; i < allocatestaffx.size(); i++)
    { AllocateStaff allocatestaffx_x = (AllocateStaff) allocatestaffx.get(i);
      if (allocatestaffx_x == null) { allocatestaffx_x = new AllocateStaff(); }
      allocatestaffx.set(i,allocatestaffx_x);
      addAllocateStaff(allocatestaffx_x);
    }
  }


  public AllocateStaff createAllocateStaff()
  { 
    AllocateStaff allocatestaffx = new AllocateStaff();
    addAllocateStaff(allocatestaffx);

    return allocatestaffx;
  }

  public void createAllDisplaySchedule(List displayschedulex)
  { for (int i = 0; i < displayschedulex.size(); i++)
    { DisplaySchedule displayschedulex_x = (DisplaySchedule) displayschedulex.get(i);
      if (displayschedulex_x == null) { displayschedulex_x = new DisplaySchedule(); }
      displayschedulex.set(i,displayschedulex_x);
      addDisplaySchedule(displayschedulex_x);
    }
  }


  public DisplaySchedule createDisplaySchedule()
  { 
    DisplaySchedule displayschedulex = new DisplaySchedule();
    addDisplaySchedule(displayschedulex);

    return displayschedulex;
  }

  public void createAllCalculateCost(List calculatecostx)
  { for (int i = 0; i < calculatecostx.size(); i++)
    { CalculateCost calculatecostx_x = (CalculateCost) calculatecostx.get(i);
      if (calculatecostx_x == null) { calculatecostx_x = new CalculateCost(); }
      calculatecostx.set(i,calculatecostx_x);
      addCalculateCost(calculatecostx_x);
    }
  }


  public CalculateCost createCalculateCost()
  { 
    CalculateCost calculatecostx = new CalculateCost();
    addCalculateCost(calculatecostx);

    return calculatecostx;
  }

  public void createAllInitialisation(List initialisationx)
  { for (int i = 0; i < initialisationx.size(); i++)
    { Initialisation initialisationx_x = (Initialisation) initialisationx.get(i);
      if (initialisationx_x == null) { initialisationx_x = new Initialisation(); }
      initialisationx.set(i,initialisationx_x);
      addInitialisation(initialisationx_x);
    }
  }


  public Initialisation createInitialisation()
  { 
    Initialisation initialisationx = new Initialisation();
    addInitialisation(initialisationx);

    return initialisationx;
  }

  public void createAllClearTasks(List cleartasksx)
  { for (int i = 0; i < cleartasksx.size(); i++)
    { ClearTasks cleartasksx_x = (ClearTasks) cleartasksx.get(i);
      if (cleartasksx_x == null) { cleartasksx_x = new ClearTasks(); }
      cleartasksx.set(i,cleartasksx_x);
      addClearTasks(cleartasksx_x);
    }
  }


  public ClearTasks createClearTasks()
  { 
    ClearTasks cleartasksx = new ClearTasks();
    addClearTasks(cleartasksx);

    return cleartasksx;
  }


public void setstaffId(Staff staffx, String staffId_x) 
  { if (staffstaffIdindex.get(staffId_x) != null) { return; }
  staffstaffIdindex.remove(staffx.getstaffId());
  staffx.setstaffId(staffId_x);
  staffstaffIdindex.put(staffId_x,staffx);
    }


public void setcostDay(Staff staffx, int costDay_x) 
  { staffx.setcostDay(costDay_x);
    }


  public void setassigned(Staff staffx, List assignedxx) 
  {   List _oldassignedxx = staffx.getassigned();
    for (int _j = 0; _j < _oldassignedxx.size(); _j++)
    { Assignment _yy = (Assignment) _oldassignedxx.get(_j);
      if (assignedxx.contains(_yy)) { }
      else { _yy.setstaff(null); }
    }
  for (int _i = 0; _i < assignedxx.size(); _i++)
  { Assignment _xx = (Assignment) assignedxx.get(_i);
    if (_oldassignedxx.contains(_xx)) { }
    else { if (_xx.getstaff() != null) { _xx.getstaff().removeassigned(_xx); }  }
    _xx.setstaff(staffx);
  }
    staffx.setassigned(assignedxx);
      }


  public void addassigned(Staff staffx, Assignment assignedxx) 
  { if (staffx.getassigned().contains(assignedxx)) { return; }
    if (assignedxx.getstaff() != null) { assignedxx.getstaff().removeassigned(assignedxx); }
  assignedxx.setstaff(staffx);
    staffx.addassigned(assignedxx);
    }


  public void removeassigned(Staff staffx, Assignment assignedxx) 
  { staffx.removeassigned(assignedxx);
    assignedxx.setstaff(null);
  }


 public void unionassigned(Staff staffx,List assignedx)
  { for (int _i = 0; _i < assignedx.size(); _i++)
    { Assignment assignmentxassigned = (Assignment) assignedx.get(_i);
      addassigned(staffx,assignmentxassigned);
     } } 


 public void subtractassigned(Staff staffx,List assignedx)
  { for (int _i = 0; _i < assignedx.size(); _i++)
    { Assignment assignmentxassigned = (Assignment) assignedx.get(_i);
      removeassigned(staffx,assignmentxassigned);
     } } 


  public void sethas(Staff staffx, List hasxx) 
  {     staffx.sethas(hasxx);
      }


  public void addhas(Staff staffx, Skill hasxx) 
  { if (staffx.gethas().contains(hasxx)) { return; }
      staffx.addhas(hasxx);
    }


  public void removehas(Staff staffx, Skill hasxx) 
  { staffx.removehas(hasxx);
    }


 public void unionhas(Staff staffx,List hasx)
  { for (int _i = 0; _i < hasx.size(); _i++)
    { Skill skillxhas = (Skill) hasx.get(_i);
      addhas(staffx,skillxhas);
     } } 


 public void subtracthas(Staff staffx,List hasx)
  { for (int _i = 0; _i < hasx.size(); _i++)
    { Skill skillxhas = (Skill) hasx.get(_i);
      removehas(staffx,skillxhas);
     } } 


  public void setstaff(Assignment assignmentx, Staff staffxx) 
  {   if (assignmentx.getstaff() == staffxx) { return; }
    if (assignmentx.getstaff() != null)
    { Staff old_value = assignmentx.getstaff();
      old_value.removeassigned(assignmentx); } 
    staffxx.addassigned(assignmentx);
    assignmentx.setstaff(staffxx);
      }


  public void settask(Assignment assignmentx, Task taskxx) 
  {   if (assignmentx.gettask() == taskxx) { return; }
    if (assignmentx.gettask() != null)
    { Task old_value = assignmentx.gettask();
      old_value.removeassignment(assignmentx); } 
    taskxx.addassignment(assignmentx);
    assignmentx.settask(taskxx);
      }


public void settaskId(Task taskx, String taskId_x) 
  { if (tasktaskIdindex.get(taskId_x) != null) { return; }
  tasktaskIdindex.remove(taskx.gettaskId());
  taskx.settaskId(taskId_x);
  tasktaskIdindex.put(taskId_x,taskx);
    }


public void setduration(Task taskx, int duration_x) 
  { taskx.setduration(duration_x);
    }


  public void setassignment(Task taskx, List assignmentxx) 
  {   List _oldassignmentxx = taskx.getassignment();
    for (int _j = 0; _j < _oldassignmentxx.size(); _j++)
    { Assignment _yy = (Assignment) _oldassignmentxx.get(_j);
      if (assignmentxx.contains(_yy)) { }
      else { _yy.settask(null); }
    }
  for (int _i = 0; _i < assignmentxx.size(); _i++)
  { Assignment _xx = (Assignment) assignmentxx.get(_i);
    if (_oldassignmentxx.contains(_xx)) { }
    else { if (_xx.gettask() != null) { _xx.gettask().removeassignment(_xx); }  }
    _xx.settask(taskx);
  }
    taskx.setassignment(assignmentxx);
      }


  public void addassignment(Task taskx, Assignment assignmentxx) 
  { if (taskx.getassignment().contains(assignmentxx)) { return; }
    if (assignmentxx.gettask() != null) { assignmentxx.gettask().removeassignment(assignmentxx); }
  assignmentxx.settask(taskx);
    taskx.addassignment(assignmentxx);
    }


  public void removeassignment(Task taskx, Assignment assignmentxx) 
  { taskx.removeassignment(assignmentxx);
    assignmentxx.settask(null);
  }


 public void unionassignment(Task taskx,List assignmentx)
  { for (int _i = 0; _i < assignmentx.size(); _i++)
    { Assignment assignmentxassignment = (Assignment) assignmentx.get(_i);
      addassignment(taskx,assignmentxassignment);
     } } 


 public void subtractassignment(Task taskx,List assignmentx)
  { for (int _i = 0; _i < assignmentx.size(); _i++)
    { Assignment assignmentxassignment = (Assignment) assignmentx.get(_i);
      removeassignment(taskx,assignmentxassignment);
     } } 


  public void setdependsOn(Task taskx, List dependsOnxx) 
  {     taskx.setdependsOn(dependsOnxx);
      }


  public void adddependsOn(Task taskx, Task dependsOnxx) 
  { if (taskx.getdependsOn().contains(dependsOnxx)) { return; }
      taskx.adddependsOn(dependsOnxx);
    }


  public void removedependsOn(Task taskx, Task dependsOnxx) 
  { taskx.removedependsOn(dependsOnxx);
    }


 public void uniondependsOn(Task taskx,List dependsOnx)
  { for (int _i = 0; _i < dependsOnx.size(); _i++)
    { Task taskxdependsOn = (Task) dependsOnx.get(_i);
      adddependsOn(taskx,taskxdependsOn);
     } } 


 public void subtractdependsOn(Task taskx,List dependsOnx)
  { for (int _i = 0; _i < dependsOnx.size(); _i++)
    { Task taskxdependsOn = (Task) dependsOnx.get(_i);
      removedependsOn(taskx,taskxdependsOn);
     } } 


  public void setneeds(Task taskx, List needsxx) 
  {     taskx.setneeds(needsxx);
      }


  public void addneeds(Task taskx, Skill needsxx) 
  { if (taskx.getneeds().contains(needsxx)) { return; }
      taskx.addneeds(needsxx);
    }


  public void removeneeds(Task taskx, Skill needsxx) 
  { taskx.removeneeds(needsxx);
    }


 public void unionneeds(Task taskx,List needsx)
  { for (int _i = 0; _i < needsx.size(); _i++)
    { Skill skillxneeds = (Skill) needsx.get(_i);
      addneeds(taskx,skillxneeds);
     } } 


 public void subtractneeds(Task taskx,List needsx)
  { for (int _i = 0; _i < needsx.size(); _i++)
    { Skill skillxneeds = (Skill) needsx.get(_i);
      removeneeds(taskx,skillxneeds);
     } } 


public void setstoryId(Story storyx, String storyId_x) 
  { if (storystoryIdindex.get(storyId_x) != null) { return; }
  storystoryIdindex.remove(storyx.getstoryId());
  storyx.setstoryId(storyId_x);
  storystoryIdindex.put(storyId_x,storyx);
    }


  public void setsubtasks(Story storyx, List subtasksxx) 
  {   List _oldsubtasksxx = storyx.getsubtasks();
  for (int _i = 0; _i < subtasksxx.size(); _i++)
  { Task _xx = (Task) subtasksxx.get(_i);
    if (_oldsubtasksxx.contains(_xx)) { }
    else { Story.removeAllsubtasks(storys, _xx); }
  }
    storyx.setsubtasks(subtasksxx);
      }


  public void setsubtasks(Story storyx, int _ind, Task taskx) 
  { storyx.setsubtasks(_ind,taskx); }
  
  public void addsubtasks(Story storyx, Task subtasksxx) 
  {   Story.removeAllsubtasks(storys,subtasksxx);
    storyx.addsubtasks(subtasksxx);
    }


  public void removesubtasks(Story storyx, Task subtasksxx) 
  { storyx.removesubtasks(subtasksxx);
    }


 public void unionsubtasks(Story storyx,List subtasksx)
  { for (int _i = 0; _i < subtasksx.size(); _i++)
    { Task taskxsubtasks = (Task) subtasksx.get(_i);
      addsubtasks(storyx,taskxsubtasks);
     } } 


 public void subtractsubtasks(Story storyx,List subtasksx)
  { for (int _i = 0; _i < subtasksx.size(); _i++)
    { Task taskxsubtasks = (Task) subtasksx.get(_i);
      removesubtasks(storyx,taskxsubtasks);
     } } 


public void setskillId(Skill skillx, String skillId_x) 
  { if (skillskillIdindex.get(skillId_x) != null) { return; }
  skillskillIdindex.remove(skillx.getskillId());
  skillx.setskillId(skillId_x);
  skillskillIdindex.put(skillId_x,skillx);
    }


public void settotalCost(Schedule schedulex, int totalCost_x) 
  { schedulex.settotalCost(totalCost_x);
    }


public void setduration(Schedule schedulex, int duration_x) 
  { schedulex.setduration(duration_x);
    }


  public void setassignment(Schedule schedulex, List assignmentxx) 
  {   List _oldassignmentxx = schedulex.getassignment();
  for (int _i = 0; _i < assignmentxx.size(); _i++)
  { Assignment _xx = (Assignment) assignmentxx.get(_i);
    if (_oldassignmentxx.contains(_xx)) { }
    else { Schedule.removeAllassignment(schedules, _xx); }
  }
    schedulex.setassignment(assignmentxx);
      }


  public void setassignment(Schedule schedulex, int _ind, Assignment assignmentx) 
  { schedulex.setassignment(_ind,assignmentx); }
  
  public void addassignment(Schedule schedulex, Assignment assignmentxx) 
  {   Schedule.removeAllassignment(schedules,assignmentxx);
    schedulex.addassignment(assignmentxx);
    }


  public void removeassignment(Schedule schedulex, Assignment assignmentxx) 
  { schedulex.removeassignment(assignmentxx);
    }


 public void unionassignment(Schedule schedulex,List assignmentx)
  { for (int _i = 0; _i < assignmentx.size(); _i++)
    { Assignment assignmentxassignment = (Assignment) assignmentx.get(_i);
      addassignment(schedulex,assignmentxassignment);
     } } 


 public void subtractassignment(Schedule schedulex,List assignmentx)
  { for (int _i = 0; _i < assignmentx.size(); _i++)
    { Assignment assignmentxassignment = (Assignment) assignmentx.get(_i);
      removeassignment(schedulex,assignmentxassignment);
     } } 


  public void setsortedtasks(Schedule schedulex, List sortedtasksxx) 
  {   List _oldsortedtasksxx = schedulex.getsortedtasks();
  for (int _i = 0; _i < sortedtasksxx.size(); _i++)
  { Task _xx = (Task) sortedtasksxx.get(_i);
    if (_oldsortedtasksxx.contains(_xx)) { }
    else { Schedule.removeAllsortedtasks(schedules, _xx); }
  }
    schedulex.setsortedtasks(sortedtasksxx);
      }


  public void setsortedtasks(Schedule schedulex, int _ind, Task taskx) 
  { schedulex.setsortedtasks(_ind,taskx); }
  
  public void addsortedtasks(Schedule schedulex, Task sortedtasksxx) 
  {   Schedule.removeAllsortedtasks(schedules,sortedtasksxx);
    schedulex.addsortedtasks(sortedtasksxx);
    }


  public void removesortedtasks(Schedule schedulex, Task sortedtasksxx) 
  { schedulex.removesortedtasks(sortedtasksxx);
    }


 public void unionsortedtasks(Schedule schedulex,List sortedtasksx)
  { for (int _i = 0; _i < sortedtasksx.size(); _i++)
    { Task taskxsortedtasks = (Task) sortedtasksx.get(_i);
      addsortedtasks(schedulex,taskxsortedtasks);
     } } 


 public void subtractsortedtasks(Schedule schedulex,List sortedtasksx)
  { for (int _i = 0; _i < sortedtasksx.size(); _i++)
    { Task taskxsortedtasks = (Task) sortedtasksx.get(_i);
      removesortedtasks(schedulex,taskxsortedtasks);
     } } 


  public void setsortedstaff(Schedule schedulex, List sortedstaffxx) 
  {   List _oldsortedstaffxx = schedulex.getsortedstaff();
  for (int _i = 0; _i < sortedstaffxx.size(); _i++)
  { Staff _xx = (Staff) sortedstaffxx.get(_i);
    if (_oldsortedstaffxx.contains(_xx)) { }
    else { Schedule.removeAllsortedstaff(schedules, _xx); }
  }
    schedulex.setsortedstaff(sortedstaffxx);
      }


  public void setsortedstaff(Schedule schedulex, int _ind, Staff staffx) 
  { schedulex.setsortedstaff(_ind,staffx); }
  
  public void addsortedstaff(Schedule schedulex, Staff sortedstaffxx) 
  {   Schedule.removeAllsortedstaff(schedules,sortedstaffxx);
    schedulex.addsortedstaff(sortedstaffxx);
    }


  public void removesortedstaff(Schedule schedulex, Staff sortedstaffxx) 
  { schedulex.removesortedstaff(sortedstaffxx);
    }


 public void unionsortedstaff(Schedule schedulex,List sortedstaffx)
  { for (int _i = 0; _i < sortedstaffx.size(); _i++)
    { Staff staffxsortedstaff = (Staff) sortedstaffx.get(_i);
      addsortedstaff(schedulex,staffxsortedstaff);
     } } 


 public void subtractsortedstaff(Schedule schedulex,List sortedstaffx)
  { for (int _i = 0; _i < sortedstaffx.size(); _i++)
    { Staff staffxsortedstaff = (Staff) sortedstaffx.get(_i);
      removesortedstaff(schedulex,staffxsortedstaff);
     } } 



  public  List AllAssignmenttoString(List assignmentxs)
  { 
    List result = new Vector();
    for (int _i = 0; _i < assignmentxs.size(); _i++)
    { Assignment assignmentx = (Assignment) assignmentxs.get(_i);
      result.add(assignmentx.toString());
    }
    return result; 
  }

  public  List AllAssignmentcost(List assignmentxs)
  { 
    List result = new Vector();
    for (int _i = 0; _i < assignmentxs.size(); _i++)
    { Assignment assignmentx = (Assignment) assignmentxs.get(_i);
      result.add(new Integer(assignmentx.cost()));
    }
    return result; 
  }

  public void displayschedule1(Assignment assignmentx)
  {   assignmentx.displayschedule1();
   }

  public void cleartasks1(Assignment assignmentx)
  {   assignmentx.cleartasks1();
   }

  public  List AllTasktotalDuration(List taskxs)
  { 
    List result = new Vector();
    for (int _i = 0; _i < taskxs.size(); _i++)
    { Task taskx = (Task) taskxs.get(_i);
      result.add(new Integer(taskx.totalDuration()));
    }
    return result; 
  }

  public void allocatestaff1(Schedule schedulex,Task t,Staff st)
  {   //  if (!(t.getassignment().size() == 0 && st.getassigned().size() == 0 && st.gethas().containsAll(t.getneeds()))) { return; } 
    schedulex.allocatestaff1(t, st);
   }

  public  List AllScheduleallocatestaff1test(List schedulexs,Task t,Staff st)
  { 
    List result = new Vector();
    for (int _i = 0; _i < schedulexs.size(); _i++)
    { Schedule schedulex = (Schedule) schedulexs.get(_i);
      result.add(new Boolean(schedulex.allocatestaff1test(t, st)));
    }
    return result; 
  }

 public static boolean allocatestaff1search()
 { return Schedule.allocatestaff1search(); }

  public void calculatecost1(Schedule schedulex)
  {   schedulex.calculatecost1();
   }

  public void initialisation1(Schedule schedulex)
  {   schedulex.initialisation1();
   }



  public void killAllStaff(List staffxx)
  { for (int _i = 0; _i < staffxx.size(); _i++)
    { killStaff((Staff) staffxx.get(_i)); }
  }

  public void killStaff(Staff staffxx)
  { if (staffxx == null) { return; }
   staffs.remove(staffxx);
    Vector _1removedstaffAssignment = new Vector();
    Vector _1qrangestaffAssignment = new Vector();
    _1qrangestaffAssignment.addAll(staffxx.getassigned());
    for (int _i = 0; _i < _1qrangestaffAssignment.size(); _i++)
    { Assignment assignmentx = (Assignment) _1qrangestaffAssignment.get(_i);
      if (assignmentx != null && staffxx.equals(assignmentx.getstaff()))
      { _1removedstaffAssignment.add(assignmentx);
        assignmentx.setstaff(null);
      }
    }
    Vector _1qrangesortedstaffSchedule = new Vector();
    _1qrangesortedstaffSchedule.addAll(schedules);
    for (int _i = 0; _i < _1qrangesortedstaffSchedule.size(); _i++)
    { Schedule schedulex = (Schedule) _1qrangesortedstaffSchedule.get(_i);
      if (schedulex != null && schedulex.getsortedstaff().contains(staffxx))
      { removesortedstaff(schedulex,staffxx); }
    }
    staffstaffIdindex.remove(staffxx.getstaffId());
    for (int _i = 0; _i < _1removedstaffAssignment.size(); _i++)
    { killAssignment((Assignment) _1removedstaffAssignment.get(_i)); }
  }



  public void killAllAssignment(List assignmentxx)
  { for (int _i = 0; _i < assignmentxx.size(); _i++)
    { killAssignment((Assignment) assignmentxx.get(_i)); }
  }

  public void killAssignment(Assignment assignmentxx)
  { if (assignmentxx == null) { return; }
   assignments.remove(assignmentxx);
    Vector _2qrangeassignedStaff = new Vector();
    _2qrangeassignedStaff.add(assignmentxx.getstaff());
    for (int _i = 0; _i < _2qrangeassignedStaff.size(); _i++)
    { Staff staffx = (Staff) _2qrangeassignedStaff.get(_i);
      if (staffx != null && staffx.getassigned().contains(assignmentxx))
      { removeassigned(staffx,assignmentxx); }
    }
    Vector _2qrangeassignmentTask = new Vector();
    _2qrangeassignmentTask.add(assignmentxx.gettask());
    for (int _i = 0; _i < _2qrangeassignmentTask.size(); _i++)
    { Task taskx = (Task) _2qrangeassignmentTask.get(_i);
      if (taskx != null && taskx.getassignment().contains(assignmentxx))
      { removeassignment(taskx,assignmentxx); }
    }
    Vector _1qrangeassignmentSchedule = new Vector();
    _1qrangeassignmentSchedule.addAll(schedules);
    for (int _i = 0; _i < _1qrangeassignmentSchedule.size(); _i++)
    { Schedule schedulex = (Schedule) _1qrangeassignmentSchedule.get(_i);
      if (schedulex != null && schedulex.getassignment().contains(assignmentxx))
      { removeassignment(schedulex,assignmentxx); }
    }
  }



  public void killAllTask(List taskxx)
  { for (int _i = 0; _i < taskxx.size(); _i++)
    { killTask((Task) taskxx.get(_i)); }
  }

  public void killTask(Task taskxx)
  { if (taskxx == null) { return; }
   tasks.remove(taskxx);
    Vector _1removedtaskAssignment = new Vector();
    Vector _1qrangetaskAssignment = new Vector();
    _1qrangetaskAssignment.addAll(taskxx.getassignment());
    for (int _i = 0; _i < _1qrangetaskAssignment.size(); _i++)
    { Assignment assignmentx = (Assignment) _1qrangetaskAssignment.get(_i);
      if (assignmentx != null && taskxx.equals(assignmentx.gettask()))
      { _1removedtaskAssignment.add(assignmentx);
        assignmentx.settask(null);
      }
    }
    Vector _1qrangedependsOnTask = new Vector();
    _1qrangedependsOnTask.addAll(tasks);
    for (int _i = 0; _i < _1qrangedependsOnTask.size(); _i++)
    { Task taskx = (Task) _1qrangedependsOnTask.get(_i);
      if (taskx != null && taskx.getdependsOn().contains(taskxx))
      { removedependsOn(taskx,taskxx); }
    }
    Vector _1qrangesortedtasksSchedule = new Vector();
    _1qrangesortedtasksSchedule.addAll(schedules);
    for (int _i = 0; _i < _1qrangesortedtasksSchedule.size(); _i++)
    { Schedule schedulex = (Schedule) _1qrangesortedtasksSchedule.get(_i);
      if (schedulex != null && schedulex.getsortedtasks().contains(taskxx))
      { removesortedtasks(schedulex,taskxx); }
    }
    Vector _1qrangesubtasksStory = new Vector();
    _1qrangesubtasksStory.addAll(storys);
    for (int _i = 0; _i < _1qrangesubtasksStory.size(); _i++)
    { Story storyx = (Story) _1qrangesubtasksStory.get(_i);
      if (storyx != null && storyx.getsubtasks().contains(taskxx))
      { removesubtasks(storyx,taskxx); }
    }
    tasktaskIdindex.remove(taskxx.gettaskId());
    for (int _i = 0; _i < _1removedtaskAssignment.size(); _i++)
    { killAssignment((Assignment) _1removedtaskAssignment.get(_i)); }
  }



  public void killAllStory(List storyxx)
  { for (int _i = 0; _i < storyxx.size(); _i++)
    { killStory((Story) storyxx.get(_i)); }
  }

  public void killStory(Story storyxx)
  { if (storyxx == null) { return; }
   storys.remove(storyxx);
    storystoryIdindex.remove(storyxx.getstoryId());
  }



  public void killAllSkill(List skillxx)
  { for (int _i = 0; _i < skillxx.size(); _i++)
    { killSkill((Skill) skillxx.get(_i)); }
  }

  public void killSkill(Skill skillxx)
  { if (skillxx == null) { return; }
   skills.remove(skillxx);
    Vector _1qrangehasStaff = new Vector();
    _1qrangehasStaff.addAll(staffs);
    for (int _i = 0; _i < _1qrangehasStaff.size(); _i++)
    { Staff staffx = (Staff) _1qrangehasStaff.get(_i);
      if (staffx != null && staffx.gethas().contains(skillxx))
      { removehas(staffx,skillxx); }
    }
    Vector _1qrangeneedsTask = new Vector();
    _1qrangeneedsTask.addAll(tasks);
    for (int _i = 0; _i < _1qrangeneedsTask.size(); _i++)
    { Task taskx = (Task) _1qrangeneedsTask.get(_i);
      if (taskx != null && taskx.getneeds().contains(skillxx))
      { removeneeds(taskx,skillxx); }
    }
    skillskillIdindex.remove(skillxx.getskillId());
  }



  public void killAllSchedule(List schedulexx)
  { for (int _i = 0; _i < schedulexx.size(); _i++)
    { killSchedule((Schedule) schedulexx.get(_i)); }
  }

  public void killSchedule(Schedule schedulexx)
  { if (schedulexx == null) { return; }
   schedules.remove(schedulexx);
  }



  public void killAllAllocateStaff(List allocatestaffxx)
  { for (int _i = 0; _i < allocatestaffxx.size(); _i++)
    { killAllocateStaff((AllocateStaff) allocatestaffxx.get(_i)); }
  }

  public void killAllocateStaff(AllocateStaff allocatestaffxx)
  { if (allocatestaffxx == null) { return; }
   allocatestaffs.remove(allocatestaffxx);
  }



  public void killAllDisplaySchedule(List displayschedulexx)
  { for (int _i = 0; _i < displayschedulexx.size(); _i++)
    { killDisplaySchedule((DisplaySchedule) displayschedulexx.get(_i)); }
  }

  public void killDisplaySchedule(DisplaySchedule displayschedulexx)
  { if (displayschedulexx == null) { return; }
   displayschedules.remove(displayschedulexx);
  }



  public void killAllCalculateCost(List calculatecostxx)
  { for (int _i = 0; _i < calculatecostxx.size(); _i++)
    { killCalculateCost((CalculateCost) calculatecostxx.get(_i)); }
  }

  public void killCalculateCost(CalculateCost calculatecostxx)
  { if (calculatecostxx == null) { return; }
   calculatecosts.remove(calculatecostxx);
  }



  public void killAllInitialisation(List initialisationxx)
  { for (int _i = 0; _i < initialisationxx.size(); _i++)
    { killInitialisation((Initialisation) initialisationxx.get(_i)); }
  }

  public void killInitialisation(Initialisation initialisationxx)
  { if (initialisationxx == null) { return; }
   initialisations.remove(initialisationxx);
  }



  public void killAllClearTasks(List cleartasksxx)
  { for (int _i = 0; _i < cleartasksxx.size(); _i++)
    { killClearTasks((ClearTasks) cleartasksxx.get(_i)); }
  }

  public void killClearTasks(ClearTasks cleartasksxx)
  { if (cleartasksxx == null) { return; }
   cleartaskss.remove(cleartasksxx);
  }




  
    public void allocateStaff() 
  { 

    boolean allocatestaff1_running;
  allocatestaff1_running = true;
    while (allocatestaff1_running) 
  { allocatestaff1_running = Schedule.allocatestaff1search(); }


  }



    public void displaySchedule() 
  { 

       List assignmentdisplayschedule1x = new Vector();
  assignmentdisplayschedule1x.addAll(Controller.inst().assignments);
  for (int assignmentdisplayschedule1x_ind6 = 0; assignmentdisplayschedule1x_ind6 < assignmentdisplayschedule1x.size(); assignmentdisplayschedule1x_ind6++)
  { Controller.inst().displayschedule1((Assignment) assignmentdisplayschedule1x.get(assignmentdisplayschedule1x_ind6)); }


  }



    public void calculateCost() 
  { 

       List schedulecalculatecost1x = new Vector();
  schedulecalculatecost1x.addAll(Controller.inst().schedules);
  for (int schedulecalculatecost1x_ind7 = 0; schedulecalculatecost1x_ind7 < schedulecalculatecost1x.size(); schedulecalculatecost1x_ind7++)
  { Controller.inst().calculatecost1((Schedule) schedulecalculatecost1x.get(schedulecalculatecost1x_ind7)); }


  }



    public void initialisation() 
  { 

       List scheduleinitialisation1x = new Vector();
  scheduleinitialisation1x.addAll(Controller.inst().schedules);
  for (int scheduleinitialisation1x_ind8 = 0; scheduleinitialisation1x_ind8 < scheduleinitialisation1x.size(); scheduleinitialisation1x_ind8++)
  { Controller.inst().initialisation1((Schedule) scheduleinitialisation1x.get(scheduleinitialisation1x_ind8)); }


  }



    public void clearTasks() 
  { 

       List assignmentcleartasks1x = new Vector();
  assignmentcleartasks1x.addAll(Controller.inst().assignments);
  for (int assignmentcleartasks1x_ind9 = 0; assignmentcleartasks1x_ind9 < assignmentcleartasks1x.size(); assignmentcleartasks1x_ind9++)
  { Controller.inst().cleartasks1((Assignment) assignmentcleartasks1x.get(assignmentcleartasks1x_ind9)); }


  }


 
}




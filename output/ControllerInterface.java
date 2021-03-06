import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Vector;

public interface ControllerInterface
{
  public void addStaff(Staff oo);
    public Staff createStaff(String staffIdx);
  public void killStaff(Staff staffxx);
 public void setassigned(Staff staffx,List assignedxx);
   public void addassigned(Staff staffx,Assignment assignedxx);
   public void removeassigned(Staff staffx,Assignment assignedxx);
   public void sethas(Staff staffx,List hasxx);
   public void addhas(Staff staffx,Skill hasxx);
   public void removehas(Staff staffx,Skill hasxx);
    public void addAssignment(Assignment oo);
    public Assignment createAssignment(Staff staffx,Task taskx);
  public void killAssignment(Assignment assignmentxx);
 public void setstaff(Assignment assignmentx,Staff staffxx);
 public void settask(Assignment assignmentx,Task taskxx);
  public void addTask(Task oo);
    public Task createTask(String taskIdx);
  public void killTask(Task taskxx);
 public void setassignment(Task taskx,List assignmentxx);
   public void addassignment(Task taskx,Assignment assignmentxx);
   public void removeassignment(Task taskx,Assignment assignmentxx);
   public void setdependsOn(Task taskx,List dependsOnxx);
   public void adddependsOn(Task taskx,Task dependsOnxx);
   public void removedependsOn(Task taskx,Task dependsOnxx);
   public void setneeds(Task taskx,List needsxx);
   public void addneeds(Task taskx,Skill needsxx);
   public void removeneeds(Task taskx,Skill needsxx);
    public void addStory(Story oo);
    public Story createStory(String storyIdx);
  public void killStory(Story storyxx);
 public void setsubtasks(Story storyx,List subtasksxx);
   public void addsubtasks(Story storyx,Task subtasksxx);
   public void removesubtasks(Story storyx,Task subtasksxx);
    public void addSkill(Skill oo);
    public Skill createSkill(String skillIdx);
  public void killSkill(Skill skillxx);
  public void addSchedule(Schedule oo);
    public Schedule createSchedule();
  public void killSchedule(Schedule schedulexx);
 public void setassignment(Schedule schedulex,List assignmentxx);
   public void addassignment(Schedule schedulex,Assignment assignmentxx);
   public void removeassignment(Schedule schedulex,Assignment assignmentxx);
   public void setsortedtasks(Schedule schedulex,List sortedtasksxx);
   public void addsortedtasks(Schedule schedulex,Task sortedtasksxx);
   public void removesortedtasks(Schedule schedulex,Task sortedtasksxx);
   public void setsortedstaff(Schedule schedulex,List sortedstaffxx);
   public void addsortedstaff(Schedule schedulex,Staff sortedstaffxx);
   public void removesortedstaff(Schedule schedulex,Staff sortedstaffxx);
    public void addAllocateStaff(AllocateStaff oo);
    public AllocateStaff createAllocateStaff();
  public void killAllocateStaff(AllocateStaff allocatestaffxx);
  public void addDisplaySchedule(DisplaySchedule oo);
    public DisplaySchedule createDisplaySchedule();
  public void killDisplaySchedule(DisplaySchedule displayschedulexx);
  public void addCalculateCost(CalculateCost oo);
    public CalculateCost createCalculateCost();
  public void killCalculateCost(CalculateCost calculatecostxx);
  public void addInitialisation(Initialisation oo);
    public Initialisation createInitialisation();
  public void killInitialisation(Initialisation initialisationxx);
  public void addClearTasks(ClearTasks oo);
    public ClearTasks createClearTasks();
  public void killClearTasks(ClearTasks cleartasksxx);
}


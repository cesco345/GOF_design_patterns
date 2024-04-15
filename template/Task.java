package template;

public abstract class Task {
    private AuditTrail auditTrail;  // Composition

    public Task() {
        auditTrail = new AuditTrail();
    }

    public Task(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute() {
        auditTrail.record();
        doExecute();
    }
  protected void doExecute(){
    System.out.println("Task");
  }

}

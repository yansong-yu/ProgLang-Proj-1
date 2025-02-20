package ast;
import java.io.PrintStream;

public class PrintStmt extends Stmt {
    public final Expr expr;
    public PrintStmt(Expr e, Location loc) {
	super(loc);
	expr = e;
    }
    public void print(PrintStream ps) { 
	ps.print("print ");
	expr.print(ps);
	ps.print(";");
    }
    public RecordYYS check(){
        RecordYYS rec = expr.check();
        if (rec.statusCode == false)
            return new RecordYYS(DataTypeYYS.NULL, false);
        else
            return rec;
    }
}

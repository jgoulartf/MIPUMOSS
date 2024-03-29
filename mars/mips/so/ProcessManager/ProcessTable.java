package mars.mips.so.ProcessManager;

import mars.mips.hardware.Register;

import java.util.LinkedList;
import java.util.List;

// Tabela de processos
public class ProcessTable {

    // Lista de processor prontos para executar
    private static LinkedList<PCB> readyProcessList;
    // Processo executando no momento
    private static PCB execProcess;

    public ProcessTable(){
        readyProcessList = new LinkedList<PCB>();
    }

    // Adiciona um processo em uma List<PCB>, lista de blocos de controle de processos
    public List<PCB> addProcess(List<PCB> processList, PCB newProcess){
        processList.add(newProcess);
        return processList;
    }

    public PCB newProcess(int initAdress,ProcessState state, Register[] registers){
        return new PCB(initAdress,state);
    }

    public void removeProcess(PCB pcb){
        this.getReadyProcessList().remove(pcb);
    }

    public List<PCB> getReadyProcessList() {
        return readyProcessList;
    }

    public static void setReadyProcessList(List<PCB> readyProcessList) {
        readyProcessList = readyProcessList;
    }

    public PCB getExecProcess() {
        return execProcess;
    }

    public static void setExecProcess(PCB execProcess) {
        execProcess = execProcess;
    }
}

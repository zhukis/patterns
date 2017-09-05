package behavioral.command.journalexample;

import behavioral.command.journalexample.commands.CloseFileCommand;
import behavioral.command.journalexample.commands.OpenFileCommand;
import behavioral.command.journalexample.commands.WriteFileCommand;
import behavioral.command.journalexample.invoker.FileInvoker;
import behavioral.command.journalexample.receiver.FileSystemReceiver;
import behavioral.command.journalexample.util.FileSystemReceiverUtil;

public class Demo {
    public static void main(String[] args) {
        FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();
        OpenFileCommand openFileCommand = new OpenFileCommand(fs);
        FileInvoker file = new FileInvoker(openFileCommand);

        file.execute();

        WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
        file = new FileInvoker(writeFileCommand);
        file.execute();

        CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
        file = new FileInvoker(closeFileCommand);
        file.execute();
    }
}

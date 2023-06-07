package command;


import client.CommandShaper;

import java.io.IOException;

public class FilterContainsCommand implements Command {
    private String param;

    private String name = "filter_contains_soundtrack_name";

    public FilterContainsCommand(String param) {
        this.param = param;
    }

    @Override
    public CommandShaper execute() throws IOException {
        CommandShaper object = new CommandShaper(name, param);
        return object;
    }

    @Override
    public String getName() {
        return name;
    }

}

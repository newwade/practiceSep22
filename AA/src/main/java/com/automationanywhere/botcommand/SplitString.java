package com.automationanywhere.botcommand;

import com.automationanywhere.botcommand.data.Value;
import com.automationanywhere.botcommand.data.impl.ListValue;
import com.automationanywhere.botcommand.data.impl.StringValue;
import com.automationanywhere.botcommand.exception.BotCommandException;
import com.automationanywhere.commandsdk.annotations.*;
import com.automationanywhere.commandsdk.annotations.BotCommand;
import com.automationanywhere.commandsdk.annotations.rules.NotEmpty;
import com.automationanywhere.commandsdk.i18n.Messages;
import com.automationanywhere.commandsdk.i18n.MessagesFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.automationanywhere.commandsdk.model.AttributeType.TEXT;

import static com.automationanywhere.commandsdk.model.DataType.*;

@BotCommand
//CommandPks adds required information to be dispalable on GUI.
@CommandPkg(
        //Unique name inside a package and label to display.
        name = "Split", label = "[[SplitString.label]]",
        node_label = "[[SplitString.node_label]]", description = "[[SplitString.description]]", icon = "pkg.svg",

        //Return type information. return_type ensures only the right kind of variable is provided on the UI.
        return_label = "[[SplitString.return_label]]", return_description = "[[SplitString.return_label_description]]", return_type = LIST, return_required = true)
public class SplitString {
    private static final Messages MESSAGES = MessagesFactory
            .getMessages("com.automationanywhere.botcommand.samples.messages");

    @Execute
    public ListValue<String> action(
            @Idx(index = "1", type = TEXT)
            //UI labels.
            @Pkg(label = "[[SplitString.string.label]]")
            //Ensure that a validation error is thrown when the value is null.
            @NotEmpty
            String text,
            @Idx(index = "2", type = TEXT)
            //UI labels.
            @Pkg(label = "[[SplitString.delimiter.label]]")
            //Ensure that a validation error is thrown when the value is null.
            @NotEmpty
            String delimiter
    ){

        if ("".equals(text.trim()))
            throw new BotCommandException(MESSAGES.getString("emptyInputString", "filePath"));



        String[] list = text.split(delimiter);
        ListValue<String> res_list = new ListValue<>();
        List<Value> values = new ArrayList<Value>();
        for(String elm : list){
            values.add(new StringValue(elm));
        }
        res_list.set(values);
        return res_list;

    }
}

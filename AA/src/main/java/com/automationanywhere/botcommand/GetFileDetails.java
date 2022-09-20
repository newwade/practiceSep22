package com.automationanywhere.botcommand;

import com.automationanywhere.botcommand.data.impl.NumberValue;
import com.automationanywhere.botcommand.exception.BotCommandException;
import com.automationanywhere.commandsdk.annotations.*;
import com.automationanywhere.commandsdk.annotations.BotCommand;
import com.automationanywhere.commandsdk.annotations.rules.NotEmpty;
import com.automationanywhere.commandsdk.i18n.Messages;
import com.automationanywhere.commandsdk.i18n.MessagesFactory;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

import static com.automationanywhere.commandsdk.model.AttributeType.FILE;
import static com.automationanywhere.commandsdk.model.DataType.NUMBER;

//BotCommand makes a class eligible for being considered as an action.
@BotCommand
//CommandPks adds required information to be dispalable on GUI.
@CommandPkg(
        //Unique name inside a package and label to display.
        name = "GetFileDetails", label = "[[GetFileDetails.label]]",
        node_label = "[[GetFileDetails.node_label]]", description = "[[GetFileDetails.description]]", icon = "pkg.svg",

        //Return type information. return_type ensures only the right kind of variable is provided on the UI.
        return_label = "[[GetFileDetails.return_label]]", return_description = "[[GetFileDetails.return_label_description]]", return_type = NUMBER, return_required = true)
public class GetFileDetails {

    //Messages read from full qualified property file name and provide i18n capability.
    private static final Messages MESSAGES = MessagesFactory
            .getMessages("com.automationanywhere.botcommand.samples.messages");

    //Identify the entry point for the action. Returns a Value<String> because the return type is String.
    @Execute
    public NumberValue action(
            //Idx 1 would be displayed first, with a text box for entering the value.
            @Idx(index = "1", type = FILE)
            //UI labels.
            @Pkg(label = "[[GetFileDetails.filePath.label]]")
            //Ensure that a validation error is thrown when the value is null.
            @NotEmpty
            String filePath
    ) {
        Path fullFilePath;
        Double fileSize;

        try {

            //Internal validation, to disallow empty strings. No null check needed as we have NotEmpty on firstString.
            if ("".equals(filePath.trim()))
                throw new BotCommandException(MESSAGES.getString("emptyInputString", "filePath"));


            fullFilePath = Path.of(filePath);
            BasicFileAttributes fileAttributes = Files.readAttributes(fullFilePath, BasicFileAttributes.class);
            fileSize = Double.valueOf(fileAttributes.size());
        } catch (Exception ex) {
            throw new BotCommandException("There was an issue getting the size of the file " + filePath + "\n" +
                    ex.getMessage());
        }


        //Return NumberValue.
        return new NumberValue(fileSize);
    }
}

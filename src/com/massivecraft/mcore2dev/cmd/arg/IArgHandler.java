package com.massivecraft.mcore2dev.cmd.arg;

import java.util.Collection;

import org.bukkit.command.CommandSender;

import com.massivecraft.mcore2dev.MPlugin;

public interface IArgHandler<T>
{
	// Parse result returned - or null and something in the error message.
	public T parse(String str, String style, CommandSender sender, MPlugin p);
	
	// Error here - or null.
	public Collection<String> getErrors();
}

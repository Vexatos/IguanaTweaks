package iguanaman.iguanatweaks;

import net.minecraftforge.client.GuiIngameForge;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerRenderers() {}

	public void disableExperienceHud()
	{
		GuiIngameForge.renderExperiance = false;
	}
}
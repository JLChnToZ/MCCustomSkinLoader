package customskinloader.plugin.defaults;

import customskinloader.config.SkinSiteProfile;
import customskinloader.loader.JsonAPILoader;
import customskinloader.loader.ProfileLoader;
import customskinloader.loader.jsonapi.GlitchlessAPI;
import customskinloader.plugin.ICustomSkinLoaderPlugin;

public class GlitchlessGames implements ICustomSkinLoaderPlugin {
    @Override
    public ProfileLoader.IProfileLoader getProfileLoader() {
        return new JsonAPILoader(new GlitchlessAPI());
    }

    @Override
    public String getName() {
        return "GlitchlessGames";
    }

    @Override
    public void updateSkinSiteProfile(SkinSiteProfile ssp) {
        ssp.type = "GlitchlessAPI";
        ssp.root = "https://games.glitchless.ru/api/minecraft/users/profiles/textures/?nickname=";
    }
}

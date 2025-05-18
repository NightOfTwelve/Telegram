package org.telegram.messenger;

import org.junit.Test;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;

import static org.junit.Assert.*;

import java.util.Arrays;


public class ExampleUnitTest {

    @Test
    public void addition_isCorrect() {assertEquals(4, 2 + 2);}


    public static TLRPC.TL_user createUser() {
        TLRPC.TL_user result = new TLRPC.TL_user();
        result.phone = "59172096496";
        result.id = 28732348;// app_id
        result.first_name = "Dn";
        result.last_name = "Mp";
        result.username = null;
        result.access_hash = 0;//
        result.photo = null;//
        result.status = null;//
        result.flags = 0;
        result.flags2 = 0;
        result.self = true;
        result.contact = false;
        result.mutual_contact = false;
        result.deleted = false;
        result.bot = false;
        result.bot_chat_history = false;
        result.bot_nochats = false;
        result.bot_can_edit = false;
        result.bot_business = false;
        result.bot_has_main_app = false;
        result.verified = false;
        result.restricted = false;
        result.min = false;
        result.bot_inline_geo = false;
        result.support = false;
        result.scam = false;
        result.apply_min_photo = true;
        result.fake = false;
        result.premium = false;
        result.close_friend = false;
        result.stories_unavailable = true;
        result.stories_hidden = false;
        result.contact_require_premium = false;
        result.bot_info_version = 0;
        result.bot_inline_placeholder = null;
        result.lang_code = null;
        result.inactive = false;
        result.explicit_content = false;
        //result.restriction_reason = [];
        result.bot_attach_menu = false;
        result.bot_menu_webview = false;
        result.attach_menu_enabled = false;
        result.emoji_status = null;
        //result.usernames = [];
        result.stories_max_id = 0;
        result.color = null;
        result.profile_color = null;
        result.bot_active_users = 0;
        result.bot_verification_icon = 0;
        result.networkType = 0;
        result.disableFree = false;

        return result;
    }

    @Test
    public void custUserTest() {
        TLRPC.TL_user user = createUser();
        SerializedData userDatas = new SerializedData();
        user.serializeToStream(userDatas);
        System.out.println(String.format("[+] stream.length():[%d]", userDatas.length()));
        byte[] serialziedUserData = userDatas.toByteArray();
        userDatas.cleanup();
        System.out.println(Arrays.toString(serialziedUserData));
    }

    @Test
    public void testUser() {
        TLRPC.TL_user result = new TLRPC.TL_user();

        TLRPC.TL_userStatusOnline status = new TLRPC.TL_userStatusOnline();
        status.flags = 0;
        status.expires = 1740120030;
        status.by_me = false;
        status.networkType = 0;
        status.disableFree = false;


        TLRPC.TL_fileLocationToBeDeprecated photo_small = new TLRPC.TL_fileLocationToBeDeprecated();
        photo_small.dc_id=0;
        photo_small.volume_id=-5006215907898402729l;
        photo_small.local_id=97;
        photo_small.secret=0;
        photo_small.file_reference=null;
        photo_small.key=null;
        photo_small.iv=null;
        photo_small.networkType=0;
        photo_small.disableFree=false;
        TLRPC.TL_fileLocationToBeDeprecated photo_big = new TLRPC.TL_fileLocationToBeDeprecated();
        photo_big.dc_id=0;
        photo_big.volume_id=-5006215907898402729l;
        photo_big.local_id=99;
        photo_big.secret=0;
        photo_big.file_reference=null;
        photo_big.key=null;
        photo_big.iv=null;
        photo_big.networkType=0;
        photo_big.disableFree=false;
        TLRPC.TL_userProfilePhoto photo = new TLRPC.TL_userProfilePhoto();
        photo.flags=3;
        photo.has_video=true;
        photo.photo_id=5006215907898402729l;
        photo.photo_small = photo_small;
        photo.photo_big = photo_big;
        photo.stripped_thumb = new byte[]{1, 8, 8, -105, 60, 103, 61, -6, 81, 69, 21, 28, -88, -20, 63};
        photo.dc_id=1;
        photo.personal=false;
        photo.strippedBitmap=null;
        photo.networkType=0;
        photo.disableFree=false;

        result.phone = "13434486085";
        result.id = 2200681948l;
        result.first_name = "Las";
        result.last_name = "Xiv";
        result.username = null;
        result.access_hash = 5924339014011992321l;
        //result.photo = org.telegram.tgnet.TLRPC$TL_userProfilePhoto@21d03963;
        //result.status = org.telegram.tgnet.TLRPC$TL_userStatusOnline@1f760b47;
        result.photo = photo;
        result.status = status;
        //result.flags = 33555575;
        //result.flags2 = 16;
        //result.flags = 1;// 33555457
        //result.flags = 0;// 33555456
        //result.flags = 96;// 33555552  photo status
        result.flags = 0;//
        result.flags2 = 0;
        result.self = true;
        result.contact = false;
        result.mutual_contact = false;
        result.deleted = false;
        result.bot = false;
        result.bot_chat_history = false;
        result.bot_nochats = false;
        result.bot_can_edit = false;
        result.bot_business = false;
        result.bot_has_main_app = false;
        result.verified = false;
        result.restricted = false;
        result.min = false;
        result.bot_inline_geo = false;
        result.support = false;
        result.scam = false;
        result.apply_min_photo = true;
        result.fake = false;
        result.premium = false;
        result.close_friend = false;
        result.stories_unavailable = true;
        result.stories_hidden = false;
        result.contact_require_premium = false;
        result.bot_info_version = 0;
        result.bot_inline_placeholder = null;
        result.lang_code = null;
        result.inactive = false;
        result.explicit_content = false;
        //result.restriction_reason = [];
        result.bot_attach_menu = false;
        result.bot_menu_webview = false;
        result.attach_menu_enabled = false;
        result.emoji_status = null;
        //result.usernames = [];
        result.stories_max_id = 0;
        result.color = null;
        result.profile_color = null;
        result.bot_active_users = 0;
        result.bot_verification_icon = 0;
        result.networkType = 0;
        result.disableFree = false;
        //System.out.println(String.format("[+] result.getObjectSize():[%d]", result.getObjectSize()));

        SerializedData stream = new SerializedData();
        result.serializeToStream(stream);
        System.out.println(String.format("[+] stream.length():[%d]", stream.length()));
        byte[] serialzieData = stream.toByteArray();
        stream.cleanup();
        System.out.println(Arrays.toString(serialzieData));
        System.out.println(result.flags);// 33555457
        System.out.println(result.flags == 33555575);// 33555575
        assertEquals(result.flags, 33555575);
        System.out.println(result.flags2);// 16
        System.out.println(result.flags2 == 16);// 16
        assertEquals(result.flags2, 16);


//        TLRPC.TL_user user = createUser();
//        SerializedData userDatas = new SerializedData();
//        user.serializeToStream(userDatas);
//        System.out.println(String.format("[+] stream.length():[%d]", userDatas.length()));
//        byte[] serialziedUserData = userDatas.toByteArray();
//        userDatas.cleanup();
//        System.out.println(Arrays.toString(serialziedUserData));


        byte[] bytes = new byte[]{126, -61, 70, 75, 119, 4, 0, 2, 16, 0, 0, 0, -36, -67, 43, -125, 0, 0, 0, 0, 1, 57, 44, -37, -15, 122, 55, 82, 3, 76, 97, 115, 3, 88, 105, 118, 11, 49, 51, 52, 51, 52, 52, 56, 54, 48, 56, 53, 6, -9, -47, -126, 3, 0, 0, 0, -87, -89, 49, 27, -40, -90, 121, 69, 15, 1, 8, 8, -105, 60, 103, 61, -6, 81, 69, 21, 28, -88, -20, 63, 1, 0, 0, 0, 73, 57, -71, -19, -34, 31, -72, 103};
        SerializedData data = new SerializedData(bytes);
        TLRPC.User currentUser = TLRPC.User.TLdeserialize(data, data.readInt32(false), false);
        data.cleanup();
        System.out.println(String.format("[+] [%s]", ((TLRPC.TL_user)currentUser).toString()));


        System.out.println(String.format("[+] isEqual:[%b]", Arrays.equals(serialzieData, bytes)));
    }

}

package br.AtomGamers.ctl;

import java.io.File;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener,CommandExecutor{
    
    public boolean ENABLED;
    
    @Override
    public void onEnable()
    {
        ConsoleCommandSender sender = Bukkit.getConsoleSender();
        getServer().getPluginManager().registerEvents(this, this);
        File file = new File(getDataFolder(), "config.yml");
        if(!file.exists())
        {
            try{
                saveResource("config_template.yml", false);
                File file2 = new File(getDataFolder(), "config_template.yml");
                file2.renameTo(new File(getDataFolder(), "config.yml"));
            }
            catch(Exception e)
            {
               
            }
        }
        reloadConfig();
        getCommand("cores").setExecutor(this);
        ENABLED=true;
        StartCheck();
        sender.sendMessage("§f[§bColored Tab List§f] Plugin inicializado. (Autor=AtomGamers)");
        sender.sendMessage("§f[§bColored Tab List§f] Sistema de checagem foi ativado por *Console*");
    }
    
    @Override
    public void onDisable()
    {
        ConsoleCommandSender sender = Bukkit.getConsoleSender();
        ENABLED=false;
        sender.sendMessage("§f[§bColored Tab List§f] Plugin finalizado. (Autor=AtomGamers)");
        sender.sendMessage("§f[§bColored Tab List§f] Sistema de checagem foi desabilitado por *Console*");
    }
    
    public void Update(final Player sender)
    {
        if(getConfig().getString("FontBold").equalsIgnoreCase("nao"))
        {
            if(sender.hasPermission("ctab.0"))
            {
                String next = "§0"+sender.getName()+"§f";
                sender.setPlayerListName(next);
            }
            else if(sender.hasPermission("ctab.1"))
            {
                String next = "§1"+sender.getName()+"§f";
                sender.setPlayerListName(next);
            }
            else if(sender.hasPermission("ctab.2"))
            {
                String next = "§2"+sender.getName()+"§f";
                sender.setPlayerListName(next);
            }
            else if(sender.hasPermission("ctab.3"))
            {
                String next = "§3"+sender.getName()+"§f";
                sender.setPlayerListName(next);
            }
            else if(sender.hasPermission("ctab.4"))
            {
                String next = "§4"+sender.getName()+"§f";
                sender.setPlayerListName(next);
            }
            else if(sender.hasPermission("ctab.5"))
            {
                String next = "§5"+sender.getName()+"§f";
                sender.setPlayerListName(next);
            }
            else if(sender.hasPermission("ctab.6"))
            {
                String next = "§6"+sender.getName()+"§f";
                sender.setPlayerListName(next);
            }
            else if(sender.hasPermission("ctab.7"))
            {
                String next = "§7"+sender.getName()+"§f";
                sender.setPlayerListName(next);
            }
            else if(sender.hasPermission("ctab.8"))
            {
                String next = "§8"+sender.getName()+"§f";
                sender.setPlayerListName(next);
            }
            else if(sender.hasPermission("ctab.9"))
            {
                String next = "§9"+sender.getName()+"§f";
                sender.setPlayerListName(next);
            }
            else if(sender.hasPermission("ctab.a"))
            {
                String next = "§a"+sender.getName()+"§f";
                sender.setPlayerListName(next);
            }
            else if(sender.hasPermission("ctab.b"))
            {
                String next = "§b"+sender.getName()+"§f";
                sender.setPlayerListName(next);
            }
            else if(sender.hasPermission("ctab.c"))
            {
                String next = "§c"+sender.getName()+"§f";
                sender.setPlayerListName(next);
            }
            else if(sender.hasPermission("ctab.d"))
            {
                String next = "§d"+sender.getName()+"§f";
                sender.setPlayerListName(next);
            }
            else if(sender.hasPermission("ctab.e"))
            {
                String next = "§e"+sender.getName()+"§f";
                sender.setPlayerListName(next);
            }
            else if(sender.hasPermission("ctab.f"))
            {
                String next = "§f"+sender.getName()+"§f";
                sender.setPlayerListName(next);
            }
        }
        else if(getConfig().getString("FontBold").equalsIgnoreCase("sim"))
        {
            if(sender.hasPermission("ctab.0"))
            {
                String next = "§0§l"+sender.getName()+"§f";
                sender.setPlayerListName(next);
            }
            else if(sender.hasPermission("ctab.1"))
            {
                String next = "§1§l"+sender.getName()+"§f";
                sender.setPlayerListName(next);
            }
            else if(sender.hasPermission("ctab.2"))
            {
                String next = "§2§l"+sender.getName()+"§f";
                sender.setPlayerListName(next);
            }
            else if(sender.hasPermission("ctab.3"))
            {
                String next = "§3§l"+sender.getName()+"§f";
                sender.setPlayerListName(next);
            }
            else if(sender.hasPermission("ctab.4"))
            {
                String next = "§4§l"+sender.getName()+"§f";
                sender.setPlayerListName(next);
            }
            else if(sender.hasPermission("ctab.5"))
            {
                String next = "§5§l"+sender.getName()+"§f";
                sender.setPlayerListName(next);
            }
            else if(sender.hasPermission("ctab.6"))
            {
                String next = "§6§l"+sender.getName()+"§f";
                sender.setPlayerListName(next);
            }
            else if(sender.hasPermission("ctab.7"))
            {
                String next = "§7§l"+sender.getName()+"§f";
                sender.setPlayerListName(next);
            }
            else if(sender.hasPermission("ctab.8"))
            {
                String next = "§8§l"+sender.getName()+"§f";
                sender.setPlayerListName(next);
            }
            else if(sender.hasPermission("ctab.9"))
            {
                String next = "§9§l"+sender.getName()+"§f";
                sender.setPlayerListName(next);
            }
            else if(sender.hasPermission("ctab.a"))
            {
                String next = "§a§l"+sender.getName()+"§f";
                sender.setPlayerListName(next);
            }
            else if(sender.hasPermission("ctab.b"))
            {
                String next = "§b§l"+sender.getName()+"§f";
                sender.setPlayerListName(next);
            }
            else if(sender.hasPermission("ctab.c"))
            {
                String next = "§c§l"+sender.getName()+"§f";
                sender.setPlayerListName(next);
            }
            else if(sender.hasPermission("ctab.d"))
            {
                String next = "§d§l"+sender.getName()+"§f";
                sender.setPlayerListName(next);
            }
            else if(sender.hasPermission("ctab.e"))
            {
                String next = "§e§l"+sender.getName()+"§f";
                sender.setPlayerListName(next);
            }
            else if(sender.hasPermission("ctab.f"))
            {
                String next = "§f§l"+sender.getName()+"§f";
                sender.setPlayerListName(next);
            }
        }else{
            getServer().broadcastMessage("§d[Server] PLUGIN COLORED TAB LIST ESTÁ CONFIGURADO DE MODO INCORRETO!");
            getServer().broadcastMessage("§d[Server] CONFIGURAÇÃO QUE ESTÁ INCORRETA: 'FontBold'");
        }
    }
    
    @EventHandler(priority=EventPriority.HIGHEST)
    private void UpdateLogin(PlayerJoinEvent e)
    {
        Update(e.getPlayer());
    }
    
    @EventHandler(priority=EventPriority.HIGHEST)
    private void UpdateQuit(PlayerQuitEvent e)
    {
        Update(e.getPlayer());
    }
    
    @EventHandler(priority=EventPriority.HIGHEST)
    private void AdminJoin(PlayerJoinEvent e)
    {
        if(e.getPlayer().hasPermission("ctab.admin"))
        {
            Player sender = e.getPlayer();
            sender.sendMessage("§b[Colored Tab List] §fNotificação sobre UPDATE'S no Plugin:");
            sender.sendMessage("§b[Colored Tab List] §fAcesse www.atomgamers.com/index.php?/");
            sender.sendMessage("§b[Colored Tab List] §fProcure pelo plugin 'Colored Tab List'");
        }
    }
    
    public void StartCheck()
    {
        if(ENABLED)
        {
            getServer().getScheduler().runTaskLater(this, new Runnable()
            {
                public void run()
                {
                    for(Player args : getServer().getOnlinePlayers())
                    {
                        Update(args);
                    }
                    StartCheck();
                }
            }, 30 * 20L);
        }else if(!ENABLED) { /* O Sistema foi desabilitado! */ }
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args)
    {
        if(cmd.getName().equalsIgnoreCase("cores"))
        {
            if(args.length==0)
            {
                sender.sendMessage("§6[Cores] §eLista de cores para o plugin Colored Tab List: ");
                sender.sendMessage(" ");
                sender.sendMessage("§b&0 §f= §0Preto");
                sender.sendMessage("§b&1 §f= §1Azul Forte");
                sender.sendMessage("§b&2 §f= §2Verde Forte");
                sender.sendMessage("§b&3 §f= §3Ciano Forte");
                sender.sendMessage("§b&4 §f= §4Vermelho Forte");
                sender.sendMessage("§b&5 §f= §5Roxo");
                sender.sendMessage("§b&6 §f= §6Ouro");
                sender.sendMessage("§b&7 §f= §7Cinza Claro");
                sender.sendMessage("§b&8 §f= §8Cinza Forte");
                sender.sendMessage("§b&9 §f= §9Azul Fraco");
            }
            else if(args[0].equalsIgnoreCase("2"))
            {
                sender.sendMessage("§6[Cores] §eLista de cores para o plugin Colored Tab List: (Pág. 2)");
                sender.sendMessage(" ");
                sender.sendMessage("§b&a §a= §aVerde Fraco");
                sender.sendMessage("§b&b §b= §bCiano Forte");
                sender.sendMessage("§b&c §c= §cVermelho Fraco");
                sender.sendMessage("§b&d §d= §dRosa");
                sender.sendMessage("§b&e §e= §eAmarelo");
                sender.sendMessage("§b&f §f= §fBranco");
            }else{
                sender.sendMessage("§6[Cores] §eUse '/cores' ou '/cores 2'!");
            }
            
        }
        else if(cmd.getName().equalsIgnoreCase("ctab"))
        {
            if(sender.hasPermission("ctab.admin"))
            {
                if(args.length==0)
                {
                    sender.sendMessage("§b[Colored Tab List] §fUse /ctab <ustatus>");
                }
                else if(args[0].equalsIgnoreCase("ustatus"))
                {
                    for(Player Players : getServer().getOnlinePlayers())
                    {
                        Update(Players);
                    }
                    sender.sendMessage("§b[Colored Tab List] §fStatus do TAB foi atualizado.");
                }
            }else{
                sender.sendMessage("§b[Colored Tab List] §cVocê não tem permissão.");
            }
        }
        return false;
    }
}
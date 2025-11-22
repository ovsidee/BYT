namespace DesignPattern.Factory
{
    public static class DatabaseFactory
    {
        public static IDatabase CreateDatabase(DatabaseType type)
        {
            return type switch
            {
                DatabaseType.Oracle => new OracleDatabase(),
                DatabaseType.SqlServer => new SqlServerDatabase(),
                _ => throw new ArgumentException("Invalid database type!")
            };
        }
    }
}
